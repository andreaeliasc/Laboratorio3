import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.andrea.laboratorio.R
import kotlinx.android.synthetic.main.activity_contactos.*

class Control : AppCompatActivity(){

    private lateinit var context: MyApplication

    lateinit var itemsAdapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)








//        Contexto que guarda mi objeto "mycontact"
            context = applicationContext as MyApplication

//        Adaptador de la lista
            itemsAdapter = ArrayAdapter<String>(this, R.layout.activity_contact_list_item, context.myContact.myNewContact)

            lv_contacts.adapter = itemsAdapter

//


//
            }





        fun buttonDone(view: View) {
            context.myContact.done() //Logica
            itemsAdapter.notifyDataSetChanged()
            Toast.makeText(baseContext, "Se realizó el pedido con éxito.", Toast.LENGTH_LONG).show()
        }

        fun buttonHome(view: View) { finish() }

    }


