package com.choi

class App {
    fun run() {
        println("== 명언 앱 ==")

        var lastId: Int = 0


        while (true) {
            print("명령) ")
            // 명령 입력
            val input = readln()

            when (input) {
                // 종료
                "종료" -> break
                // 명언 등록
                "등록" -> {
                    // 명언 입력
                    print("명언 : ")
                    val content = readln()
                    // 작가 입력
                    print("작가 : ")
                    val author = readln()
                    // 명언 번호 출력
                    println("${++lastId}번 명언이 등록되었습니다.")
                }
            }
        }
    }
}