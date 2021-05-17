package com.deyvsonaguiar.recyclermasterkotlin.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Veja as nossas principais notícias para você conseguir"
        preview = "Olá, Deyvson, você precisa acessar esse site"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Um amigo quer que você curta uma página dele"
        preview = "Fulano convidou você para curtir a sua página"
        date = "30 jun"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Tiago acabou de enviar um vídeo"
        preview = "Tiago Aguiar enviou: ANDROID: GOOGLE MAPS"
        date = "26 jun"
        stared = true
        unread = true
    },
    email {
        user = "CONGRESSE.ME"
        subject = "Última oportunidade: UM ANO GRATUITO DE MUITAS NOVIDADES"
        preview = "Visualizar como página web Olá Deyvson, tudo bem"
        date = "27 jun"
        stared = false
        unread = true
    },
    email {
        user = "Luiz Sato do RaioX"
        subject = "[Aula a...] Os 7 Gatilhos de Entrada - Risco Baixo e Lucro Rápido"
        preview = "Compreenda a verdadeira lógica por trás das movimentações"
        date = "30 jun"
        stared = true
    },
    email {
        user = "Iti"
        subject = "Já viu a nova missão da itimania?"
        preview = "Tem uma graninha te esperando bora fazer o seu dinheiro render"
        date = "25 jun"
        stared = false
        unread = true
    },
    email {
        user = "Youtube"
        subject = "Deyvson acabou de enviar um vídeo"
        preview = "Tiago Aguiar enviou: KOTLIN: MIL MANEIRAS DE CRIAR MAPS"
        date = "27 jun"
        stared = false
        unread = true
    },
    email {
        user = "Prof Jefferson Williams"
        subject = "LIVE EXTRA SURPRESA"
        preview = "...Hoje vamos ter uma MISSÂO 6 EXCLUSIVA Ao Vivo. Não perca!"
        date = "24 jun"
        stared = true
    },
    email {
        user = "NuBank"
        subject = "O Nubank de cara nova"
        preview = "Conheça as mudanças, como isso reflete nosso jeito de ser"
        date = "31 jun"
        stared = true
    },
    email {
        user = "NuBank"
        subject = "Sua fatura Nubank chegou"
        preview = "Sua fatura do mês de junho acaba de ser fechada. Veja detalhes"
        date = "30 jun"
        stared = true
        unread = true
    }
)