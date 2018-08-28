package com.example.admin.volvocodingchallenge.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.admin.volvocodingchallenge.R
import com.example.admin.volvocodingchallenge.data.remote.models.MetaWeatherResponse
import com.example.admin.volvocodingchallenge.databinding.RecyclerViewItemBinding

class WeatherAdapter(private val weatherList: List<MetaWeatherResponse>, private val context: Context) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherAdapter.ViewHolder {
        val itemBinding = DataBindingUtil.inflate<RecyclerViewItemBinding>(LayoutInflater.from(parent.context), R.layout.recycler_view_item, parent, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    override fun onBindViewHolder(holder: WeatherAdapter.ViewHolder, position: Int) {
        var temp = weatherList[position]
        holder.binding.textViewMain.text = temp.weatherStateName
        holder.binding.textViewDescription.text = temp.created
        Glide.with(context).load("https://www.metaweather.com/static/img/weather/png/64/${temp.weatherStateAbbr}.png").into(holder.binding.imageViewIcon)
    }

    class ViewHolder(var binding: RecyclerViewItemBinding) : RecyclerView.ViewHolder(binding.root)
}