package com.untha.viewmodels

import androidx.lifecycle.ViewModel
import com.untha.model.transactionalmodels.Category

class InformationCalculatorViewModel : ViewModel() {

    fun getCategoryById(id: Int, categories: ArrayList<Category>): Category? {
        return categories.firstOrNull { it.id == id }
    }

}
