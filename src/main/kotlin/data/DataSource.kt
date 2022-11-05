package data

import model.Archive
import model.Note

object DataSource {
    private val archives: MutableList<Archive> = mutableListOf()
    private val notes: MutableList<Note> = mutableListOf()
    fun addArchive(name: String) {
        archives.add(Archive(archives.lastIndex + 1, name))
    }
    fun addNote(name: String, archiveId: Int, text: String) {
        notes.add(Note(notes.lastIndex + 1, name, archiveId, text))
    }
    fun getArchives(): List<Archive> {
        return archives.toList()
    }
    fun getNotes(archiveId: Int): List<Note> {
        return notes.toList().filter { note -> note.archiveId == archiveId }
    }
}