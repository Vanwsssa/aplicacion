package com.example.aplicacion.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aplicacion.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar los botones con mensajes diferentes
        binding.button1.setOnClickListener {
            Toast.makeText(requireContext(), "El Instituto Politécnico Nacional (IPN) se fundó en 1936", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener {
            Toast.makeText(requireContext(), "La Técnica al Servicio de la Patria", Toast.LENGTH_SHORT).show()
        }

        binding.button3.setOnClickListener {
            Toast.makeText(requireContext(), "Escuela Superior de Computo", Toast.LENGTH_SHORT).show()
        }

        binding.button4.setOnClickListener {
            Toast.makeText(requireContext(), "Ingeniería en Sistemas Computacionales", Toast.LENGTH_SHORT).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}