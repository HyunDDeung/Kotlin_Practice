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
import kotlinx.android.synthetic.main.fragment_first.view.image3
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val items = mutableListOf<String>()
        items.add("That That")
        items.add("DADDY")
        items.add("예술이야")
        items.add("I LUV IT")
        items.add("챔피언")
        items.add("기댈곳")
        items.add("어땠을까")
        items.add("챔피언")
        items.add("감동이야")
        items.add("마지막 장면")

        val rv = view.rv2
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        view.image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondFragment2_to_firstFragment2)
        }
        view.image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment)
        }

        return view
    }
}