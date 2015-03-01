.data
    bogus: .asciiz "This is a string.\n"
    bogus2: .asciiz "len8str\n"
    bogus3: .asciiz "Got out of loop.\n"
    rev:    .asciiz "Reverse Me!"

.text
    j main

print:
    #create a loop
    add $r10, $r0, $r0
    addi $r11, $r0, 100
loop:
    slt $r12, $r10, $r11
    beq $r12, $r0, unloop
    addi $r10, $r10, 1
    j loop
unloop:
    addi $r2, $r0, 4    # set syscall type to "print string"
    lui $r4, 0x1001     # load starting memory address
    ori $r4, $r4, bogus3     # or with 16-bit lower offset value
    syscall             # print
    j reverse_string

main:
    addi $r8, $r0, -1   # what does this actually put in the register?
    addi $r2, $r0, 1
    add $r4, $r0, $r8
    syscall
    addi $r2, $r0, 4    # set syscall type to "print string"
    lui $r4, 0x1001     # load starting memory address
    ori $r4, $r4, bogus     # or with 16-bit lower offset value
    syscall             # print
    j print2

exit:
    addi $r2, $r0, 10   # set syscall to exit
    syscall             # exit

print2:
    addi $r2, $r0, 4    # set syscall type to "print string"
    lui $r4, 0x1001     # load starting memory address
    ori $r4, $r4, bogus2     # or with 16-bit lower offset value
    syscall             # print
    j print

reverse_string:
    addi $r2, $r0, 4    # set syscall type to "print string"
    lui $r4, 0x1001     # load starting memory address
    ori $r4, $r4, rev     # or with 16-bit lower offset value
    syscall             # print
    add $r8, $r0, $r0   # set counter to zero
    lui $r10, 0x1001    # load top of address
    ori $r10, $r10, rev # load bottom of address
    lbu $r9, 0($r10)    # get first byte
strlenLoop:
    beq $r9, $r0, gotLen
    addi $r10, $r10, 1
    addi $r8, $r8, 1
    lbu $r9, 0($r10)    #get next byte
    j strlenLoop
gotLen:
    addi $r2, $r0, 1
    add $r4, $r8, $r0
    syscall
    #r8 now contains length of string
    #r14 begins at start of string
    lui $r14, 0x1001
    ori $r14, $r14, rev
    add $r11, $r0, $r0
    add $r12, $r0, $r8
    addi $r12, $r12, -1 # length without the null terminator
    #r15 begins at end of string
    add $r15, $r14, $r12
revLoop:
    slt $r13, $r12, $r11
    bne $r13, $r0, reversed
    lbu $r16, 0($r14)
    lbu $r17, 0($r15)
    sb $r17, 0($r14)
    sb $r16, 0($r15)
    addi $r11, $r11, 1
    addi $r14, $r14, 1
    addi $r12, $r12, -1
    addi $r15, $r15, -1
    j revLoop
reversed:
    addi $r2, $r0, 4    # set syscall type to "print string"
    lui $r4, 0x1001     # load starting memory address
    ori $r4, $r4, rev     # or with 16-bit lower offset value
    syscall             # print
    j exit




