package com.example.wikeapiapp.util

object RemoteUtils {

    const val MAIN_URL: String = "https://en.wikipedia.org/w/"
    const val ACTION_KEY: String = "action"
    const val ACTION_VALUE: String = "query"

    const val FORMAT_VERSION_KEY: String = "formatversion"
    const val FORMAT_VERSION_VALUE: String = "2"

    const val GENERATOR_KEY: String = "generator"
    const val GENERATOR_VALUE: String = "prefixsearch"

    const val GPS_LIMIT_KEY: String = "gpslimit"
    const val GPS_LIMIT_VALUE: String = "10"

    const val PROP_KEY: String = "prop"
    const val PROP_VALUE: String = "pageterms|pageimages|revisions"

    const val PILIMIT_KEY: String = "pilimit"
    const val PILIMIT_VALUE: String = "10"

    const val WBPTTERMS_KEY: String ="wbptterms"
    const val WBPTTERMS_VALUE: String ="description"

    /*const val EXINTRO_KEY: String = "exintro"
    const val EXINTRO_VALUE: String = "true"

    const val EXSENTENCES_KEY: String = "exsentences"
    const val EXSENTENCES_VALUE: String = "2"

    const val EXPLAINTEXT_KEY: String = "explaintext"
    const val EXPLAINTEXT_VALUE: String = "true"*/

    /**
     * [piprop]: Which information to return:
     * [thumbnail]: URL and dimensions of thumbnail image associated with page, if any.
     * [original]: URL and original dimensions of image associated with page, if any.
     * [name]: Image title.
     */
    const val PIPROP_KEY: String = "piprop"
    const val PIPROP_VALUE: String = "thumbnail"

    /**
     * [pithumbsize]: Maximum width in pixels of thumbnail images.
     */
    const val PITHUMBSIZE_KEY: String = "pithumbsize"
    const val PITHUMBSIZE_VALUE: String = "300"

    /**
     * [rvprop] :Which properties to get for each revision:
     */
   /* const val RVPROP_KEY: String = "rvprop"
    const val RVPROP_VALUE: String = "timestamp"*/

    const val FORMAT_KEY: String = "format"
    const val FORMAT_VALUE: String = "json"
}