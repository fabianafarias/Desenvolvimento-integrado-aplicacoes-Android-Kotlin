package com.fabianafarias.applicationcontentprovider

import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import androidx.recyclerview.widget.RecyclerView
import com.fabianafarias.applicationcontentprovider.database.NotesDataBaseHelper.Companion.TITLE_NOTES
import com.fabianafarias.applicationcontentprovider.database.NotesProvider.Companion.URI_NOTES
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<Cursor> {

    lateinit var noteRecyclerView: RecyclerView
    lateinit var noteAdd: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteAdd = findViewById(R.id.note_add)
        noteAdd.setOnClickListener {  }

        noteRecyclerView = findViewById(R.id.notes_recycler)
    }

    //instanciar o que será buscado
    override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> =
        CursorLoader(this, URI_NOTES, null, null, null, TITLE_NOTES)

    //pegar dados recebidos do onCreateLoader e manipulá-los
    override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
        if (data != null) {}
    }

    override fun onLoaderReset(loader: Loader<Cursor>) {
        //terminar pesquisa em segundo plano do LoadManager
    }
}