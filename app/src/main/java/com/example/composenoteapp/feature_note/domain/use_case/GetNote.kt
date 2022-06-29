package com.example.composenoteapp.feature_note.domain.use_case

import com.example.composenoteapp.feature_note.domain.model.Note
import com.example.composenoteapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {

        return repository.getNoteNyId(id)
    }
}