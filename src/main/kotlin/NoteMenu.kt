class NoteMenu : BaseMenu<Pair<String, String>>(
    mutableListOf(), MenuUtils(), "заметок", "Создать заметку"
) {

    override fun menuItemSelected(item: Pair<String, String>) {
        println("Заметка: ${item.first}")
        println("Содержание: ${item.second}")
    }

    override fun createItem() {
        println("Введите название заметки:")
        val title = readln().trim()
        if (title.isEmpty()) {
            println("Название заметки не может быть пустым.")
            return
        }

        println("Введите текст заметки:")
        val content = readln().trim()
        if (content.isEmpty()) {
            println("Текст заметки не может быть пустым.")
            return
        }

        items.add(Pair(title, content))
        println("Заметка \"$title\" успешно создана.")
    }

    fun show() {
        showMenu()
    }
}