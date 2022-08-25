package com.example.singer_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.rv_item.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val items = mutableListOf<String>()
        items.add("봄여름가을겨울")
        items.add("뱅뱅뱅")
        items.add("LOSER")
        items.add("에라 모르겠다")
        items.add("맨정신")
        items.add("IF YOU")
        items.add("Fantastic Baby")
        items.add("우리 사랑하지 말아요")


        val rv = view.rv1
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2)
        }

        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment2_to_thirdFragment)
        }

        return view
    }
}