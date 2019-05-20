package com.haroldadmin.moonshot.models.common

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lengths")
data class Length(
    @ColumnInfo(name = "meters")
    val meters: Double,
    @ColumnInfo(name = "feet")
    val feet: Double
) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "length_id")
    var lengthId: Int? = null

}