package com.example.pdf_reader

import android.graphics.RectF

data class SearchResults(
    val page: Int,
    val results: List<RectF>
)