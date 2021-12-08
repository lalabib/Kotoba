package com.capstone.project.kotoba.ui.instruksi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.capstone.project.kotoba.databinding.FragmentInstruksiBinding

class InstruksiFragment : DialogFragment() {

    private var _fragmentInstruksiBinding: FragmentInstruksiBinding? = null
    private val binding get() = _fragmentInstruksiBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _fragmentInstruksiBinding = FragmentInstruksiBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //code here
        binding?.btnClose?.setOnClickListener{
            dialog?.cancel()
        }
    }
}