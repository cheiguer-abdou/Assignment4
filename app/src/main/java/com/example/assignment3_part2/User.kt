import android.os.Parcel
import android.os.Parcelable

class User(): Parcelable {
    var firstName: String = ""
        set(value) {
            field = value
        }
        get() = field

    var lastName: String = ""
        set(value) {
            field = value
        }
        get() = field

    var username: String = ""
        set(value) {
            field = value
        }
        get() = field

    var password: String = ""
        set(value) {
            field = value
        }
        get() = field

    constructor(parcel: Parcel) : this() {
    }

    // Constructors
    constructor(firstName: String, lastName: String, username: String, password: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.username = username
        this.password = password
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}
