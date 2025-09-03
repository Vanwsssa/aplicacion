package com.example.aplicacion.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aplicacion.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textNotifications.text = "Selecciona lo que mas te guste"
        // CheckBox
        binding.checkBoxOption.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(requireContext(), "Si te gusto la aplicacion ❤️", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "No te gusto mi aplicacion 😢 ", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textNotifications.text = "Que helado te gusta mas"
        // RadioButtons
        binding.radioGroupOptions.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                binding.radioOption1.id -> Toast.makeText(requireContext(), "Chocolate", Toast.LENGTH_SHORT).show()
                binding.radioOption2.id -> Toast.makeText(requireContext(), "Vainilla", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textNotifications.text = "Selecciona lo que mas te guste"
        // Switch
        binding.switchOption.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(requireContext(), "Activado ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Apagado", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}