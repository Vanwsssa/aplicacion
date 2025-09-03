package com.example.aplicacion.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplicacion.databinding.FragmentListBinding
import androidx.recyclerview.widget.LinearLayoutManager

class ListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListBinding.inflate(inflater, container, false)


        // Ejemplo de datos para la lista
        val listaItems = listOf("La primera mejor escuela de poli es ESIME", " La segunda es UPIBI", "La tercera es ESCOM", "La cuarta es ESIA", "La quinta es UPIIG","La sexta es ENCB")

        // Configurar RecyclerView
        binding.recyclerViewList.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewList.adapter = ListAdapter(listaItems)
        binding.recyclerViewList.setHasFixedSize(true)


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}