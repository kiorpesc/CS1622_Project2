.data
    bogus: .asciiz "This is a string."

.text
    lui $r5, 0x1001
    lb $r6, 0($r5)
    add $r1, $r17, $r3
    add $r2, $r1, $r2
    addi $r1, $r1, -898
    j 2