package com.example.hceapplicationdemo

/**
 * Created by mhamdaoui on 2017-10-27.
 */
class Utils {

    companion object {
        private val HEX_CHARS = "0123456789ABCDEF"
        fun hexStringToByteArray(data: String) : ByteArray {

//            }
            val charset = Charsets.UTF_8
            val byteArray = data.toByteArray(charset)

            return byteArray;
        }

        private val HEX_CHARS_ARRAY = "0123456789ABCDEF".toCharArray()
        fun toHex(byteArray: ByteArray) : String {
            val result = StringBuffer()

            byteArray.forEach {
                val octet = it.toInt()
                val firstIndex = (octet and 0xF0).ushr(4)
                val secondIndex = octet and 0x0F
                result.append(HEX_CHARS_ARRAY[firstIndex])
                result.append(HEX_CHARS_ARRAY[secondIndex])
            }

            return result.toString()
        }
    }
}
