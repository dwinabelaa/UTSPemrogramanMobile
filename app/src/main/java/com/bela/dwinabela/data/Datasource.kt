package com.bela.dwinabela.data

import com.bela.dwinabela.R
import com.bela.dwinabela.model.Router

class Datasource {
    fun loadRouter(): List<Router> {
        return listOf<Router>(
            Router(R.string.teknologi1, R.drawable.netgear),
            Router(R.string.teknologi2, R.drawable.huawei),
            Router(R.string.teknologi3, R.drawable.tplink),
            Router(R.string.teknologi4, R.drawable.dlink),
            Router(R.string.teknologi5, R.drawable.tenda),
            Router(R.string.teknologi6, R.drawable.xiaomi),
            Router(R.string.teknologi7, R.drawable.asus),
            Router(R.string.teknologi8, R.drawable.trendnet),
            Router(R.string.teknologi9, R.drawable.linksys),
            Router(R.string.teknologi10, R.drawable.synology),
            Router(R.string.teknologi11, R.drawable.googlenest),
            Router(R.string.teknologi12, R.drawable.totolink),
        )
    }
}