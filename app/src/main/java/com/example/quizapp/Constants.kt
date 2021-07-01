package com.example.quizapp

object Constants {

    const val username: String = "username"
    const val totalQuestions: String = "totalQuestions"
    const val correctAnswers: String = "correctAnswers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "How many different months have exactly thirty days in 2008?",
            "4", "5",
            "6", "7",
            1)

        val que2 = Question(2, "A farmer has seventeen cows; all but eight die. How many cows does the farmer have left?",
            "11", "9",
            "8", "10",
            3)

        val que3 = Question(3, "Which country is largest in terms of land mass?",
            "Spain", "Peru",
            "Italy", "Australia",
            4)

        val que4 = Question(4, "What is the aprox. average height of a full grown man in the US?",
            "6ft-3in", "5ft-9in",
            "5ft-6in","5ft-5in",
            2)

        val que5 = Question(5, "In what year did the US declare its independence from Great Britain?",
            "1776", "1492",
            "1976", "1942",
            1)

        val que6 = Question(6, "He finished all of the candy __________ for one last piece which he gave to me.",
            "Except", "Accept",
            "Adept", "Kept",
            1)

        val que7 = Question(7, "What is worth more?",
            "1 pound of dimes", "1 kilogram of dimes",
            "1 ton of dimes", "1 metric ton of dimes",
            3)

        val que8 = Question(8, "What date does the 4th of July fall on in Russia?",
            "January 1st", "July 4th",
            " December 31st", "October 12th",
            2)

        val que9 = Question(9, "What hotel chain is Paris Hilton most closely associated with?",
            "Marriott", "Comfort Inn",
            "The Ritz-Carlton", "Hilton",
            4)

        val que10 = Question(10, "Who is the current Prime Minister of the United Kingdom?",
            "Boris Johnson", "Winston Churchill",
            "Margaret Thatcher", "Queen Elizabeth II",
            1)

        val que11 = Question(11, "What is the square root of 9?",
            "81", "18",
            "27", "3",
            4)

        val que12 = Question(12, "The __________ of his injury was to prevent him from playing any further.",
            "Effect", "Affect",
            "Defect", "Reject",
            1)

        val que13 = Question(13, "What time do you have to get up if the drill sergeant tells you wake up is at \"oh six hundred\"?",
            "6am", "8am",
            "6pm", "4pm",
            1)

        val que14 = Question(14, "Which of these cities is a capital of a country with a coastline on the Mediterranean Sea?",
            "Tokyo", "Rome",
            "Oslo", "Venice",
            2)

        val que15 = Question(15, "Which is greater 1/2 of 1/4 or 1/4 of 1/2?",
            "1/2 of 1/4","1/4 of 1/2",
            "They are equal", "All of the above",
            3)

        val que16 = Question(16, "Which distance is longer?",
            "1 mile",  "1000 meters",  "10000 centimeters", "1 Kilometer",
            4)

        val que17 = Question(17, "Who died first?",
            "Julius Cesar", "Genghis Khan",
            "Alexander the Great" ,"Marie Antoinette",
            3)

        val que18 = Question(18, "How many months are in a decade?",
            "120",  "100",  "1200",  "10",
            1)

        val que19 = Question(19, "Which shape has the most sides?",
            "Square", "Hexagon",
            "Pentagon", "Octagon",
            4)

        val que20 = Question(20, "What language is most commonly spoken in Brazil?",
            "Portuguese", "Spanish",
            "Brazilian", "French",
            1)

        val que21 = Question(21, "How many sides does a hexagon have?",
            "5", "6",
            "7", "8",
            2)

        val que22 = Question(22, "What is the chemical symbol for Iron?",
            "Ir", "I",
            "Au", "Fe",
            4)

        val que23 = Question(23, "Approximately how far is it from New York City to London?",
            "500 miles", "1,000 miles",
            "3,000 miles", "10,000 miles",
            3)

        val que24 = Question(24, "Glasnost was a political policy introduced in what country?",
            "United States", "The Soviet Union",
            "France", "Canada",
            2)

        val que25 = Question(25, "Which is NOT a prime number?",
            "7", "13",
            "27", "29",
            3
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)
        questionList.add(que11)
        questionList.add(que12)
        questionList.add(que13)
        questionList.add(que14)
        questionList.add(que15)
        questionList.add(que16)
        questionList.add(que17)
        questionList.add(que18)
        questionList.add(que19)
        questionList.add(que20)
        questionList.add(que21)
        questionList.add(que22)
        questionList.add(que23)
        questionList.add(que24)
        questionList.add(que25)

        return questionList
    }
}