package com.example.sanzharshop.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ModelM implements Parcelable, Serializable {
    @SerializedName("id")
    @Expose
    int modelId;

    @SerializedName("title")
    @Expose
    String modelTitle;

    @SerializedName("description")
    @Expose
    String modelDescription;

    @SerializedName("category")
    @Expose
    String modelCategory;

    @SerializedName("price")
    @Expose
    int modelPrice;

    @SerializedName("image")
    @Expose
    String modelImage;

    protected ModelM(Parcel in) {
        modelId = in.readInt();
        modelTitle = in.readString();
        modelDescription = in.readString();
        modelCategory = in.readString();
        modelPrice = in.readInt();
        modelImage = in.readString();
    }

    public static final Creator<ModelM> CREATOR = new Creator<ModelM>() {
        @Override
        public ModelM createFromParcel(Parcel in) {
            return new ModelM(in);
        }

        @Override
        public ModelM[] newArray(int size) {
            return new ModelM[size];
        }
    };

    public ModelM(String modelTitle, String modelDescription, String modelCategory, int modelPrice, String modelImage) {
        this.modelTitle = modelTitle;
        this.modelDescription = modelDescription;
        this.modelCategory = modelCategory;
        this.modelPrice = modelPrice;
        this.modelImage = modelImage;
    }

    @Override
    public String toString() {
        return "ModelM{" +
                "modelId=" + modelId +
                ", modelTitle='" + modelTitle + '\'' +
                ", modelDescription='" + modelDescription + '\'' +
                ", modelCategory='" + modelCategory + '\'' +
                ", modelPrice=" + modelPrice +
                ", modelImage='" + modelImage + '\'' +
                '}';
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public int getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(int modelPrice) {
        this.modelPrice = modelPrice;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    public String getModelCategory() {
        return modelCategory;
    }

    public void setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(modelId);
        dest.writeString(modelTitle);
        dest.writeString(modelDescription);
        dest.writeString(modelCategory);
        dest.writeInt(modelPrice);
        dest.writeString(modelImage);
    }
}
