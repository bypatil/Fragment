package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val ARG_PARAM1= "param1"
private const val ARG_PARAM2= "param2"

@Suppress("UNREACHABLE_CODE")
class FirstFragment : Fragment() {
    private var param1: String? =null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        Log.d("Frg onStart","Frg onStart Started")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        Log.d("Frg onCreateView","Frg onCreateView")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Frg onViewCreated","Frg onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Frg onStart","Frg onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Frg onResume","Frg onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Frg onPause","Frg onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Frg onStop","Frg onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Frg onDestroyView","Frg onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Frg onDestroy","Frg onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Frg onDetach","Frg onDetach")
    }



    companion object{

        @JvmStatic
        fun newInstance(param1:String,param2:String)=
            FirstFragment().apply {
                arguments=Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}