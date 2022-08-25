package com.example.singer_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_first.view.image1
import kotlinx.android.synthetic.main.fragment_first.view.image2
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val items = mutableListOf<String>()
        items.add("Savage")
        items.add("Lingo")
        items.add("Next Level")
        items.add("도깨비불")
        items.add("ICONIC")
        items.add("I'll Make You Cry")
        items.add("YEPPI YEPPI")

        val rv = view.rv3
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        view.image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment2)
        }
        view.image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment2)
        }

        return view
    }
}