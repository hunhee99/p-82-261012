package com.choi

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("== 명언 앱 ==")

    while (true) {
        print("명령) ")
        // 명령 입력
        val input = readln()

        // 종료
        if (input == "종료"){
            break
        }
    }
}