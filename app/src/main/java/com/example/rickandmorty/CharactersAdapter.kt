package com.example.rickandmorty

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.databinding.CharacterItemListBinding

class CharactersAdapter(private val characterList: List<Characters>) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        return CharactersViewHolder(
            CharacterItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val characters = characterList[position]
        holder.bind(characters)
    }

    override fun getItemCount(): Int = characterList.size

    inner class CharactersViewHolder(private val binding: CharacterItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(characters: Characters) {
            Glide.with(binding.root.context)
                .load(characters.image)
                .centerCrop()
                .placeholder(R.drawable.img_placeholder)
                .into(binding.imageIv)
            binding.nameTv.text = characters.name
            binding.statusTv.text = characters.status
            binding.specieTv.text = characters.species
        }
    }
}