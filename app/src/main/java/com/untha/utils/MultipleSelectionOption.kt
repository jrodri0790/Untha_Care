package com.untha.utils

import android.widget.TextView

data class MultipleSelectionOption(
    val position: Int,
    var isSelected: Boolean,
    var textView: TextView?,
    var code: String?,
    var remaining:Int?
)
