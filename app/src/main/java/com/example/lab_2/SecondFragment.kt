package com.example.lab_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.bumptech.glide.Glide

class SecondFragment : Fragment() {
    var navController: NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        navController = Navigation.findNavController(view)
        val currentMusicURL= arguments?.getString("Music URL")
        val currentMusicName= arguments?.getString("Music Name")
        val currentMusicDescription = arguments?.getString("Music Description")

        var description: TextView = view.findViewById(R.id.tv_description)
        var musicName: TextView =view.findViewById(R.id.tv_name)
        var image: ImageView = view.findViewById(R.id.iv_music)

        description.text = currentMusicDescription
        musicName.text = currentMusicName
        Glide.with(requireContext())
            .load(currentMusicURL)
            .into(image)
    }
}