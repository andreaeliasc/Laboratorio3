


class MyNewContact : NewContact{
override val myNewContact: ArrayList<String> = arrayListOf()

override fun clear() {
    myNewContact.clear()
}

override fun add(element: String) {
    myNewContact.add(element)
}

override fun del(elementIndex: Int) {
    myNewContact.removeAt(elementIndex)
}

override fun done() {
    clear()
}

}

