package com.choi

class App {
    fun run() {
        println("== 명언 앱 ==")

        var lastId: Int = 0
        val wiseSayings = mutableListOf<WiseSaying>()

        while (true) {
            print("명령) ")
            // 명령 입력
            val input = readln()

            val rq = Rq(input)

            val action = rq.actionName

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

                    val id = ++lastId

                    // 리스트로 저장
                    val wiseSaying = WiseSaying(id, content, author)
                        .also {
                            wiseSayings.add(it)
                        }

                    // 명언 번호 출력
                    println("${id}번 명언이 등록되었습니다.")
                }
                // 명언 목록 조회 (최신순 조회)
                "목록" -> {
                    println("번호 / 작가 / 명언")
                    println("----------------------")
                    wiseSayings
                        .reversed()
                        .forEach {
                            println("${it.id} / ${it.content} / ${it.author}")
                        }
                }
                // 명언 삭제
                "삭제" -> {
                    val id: Int = rq.getParamAsInt("id", 0)
                }
            }
        }
    }
}