package com.food.ordering.zinger.data.model

import android.os.Parcel
import android.os.Parcelable

class Campus(var id: String?, var name: String?, var desc: String?, var rating: String?, var imageUrl: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(desc)
        parcel.writeString(rating)
        parcel.writeString(imageUrl)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Campus> {
        override fun createFromParcel(parcel: Parcel): Campus {
            return Campus(parcel)
        }

        override fun newArray(size: Int): Array<Campus?> {
            return arrayOfNulls(size)
        }
    }
}