package com.basicsteps.multipos.event_bus_channels

enum class ConfigHandlerChannel(val channel: String) {
    GET_UNIT_CATEGORY("GET_UNIT_CATEGORY"),
    GET_UNIT_CATEGORY_WITH_UNITS("GET_UNIT_CATEGORY_WITH_UNITS"),
    GET_UNITS("GET_UNITS"),
    ADD_POS("ADD_POS"),
    ADD_STOCK("ADD_STOCK"),
    ADD_ACCOUNT("ADD_ACCOUNT"),
    GET_ACCOUNT_LIST("GET_ACCOUNT_LIST"),
    GET_ACCOUNT_BY_ID("GET_ACCOUNT_BY_ID"),
    UPDATE_ACCOUNT("UPDATE_ACCOUNT"),
    REMOVE_ACCOUNT("REMOVE_ACCOUNT"),
    REMOVE_ACCOUNT_LIST("REMOVE_ACCOUNT_LIST"),
    TRASH_ACCOUNT_LIST("TRASH_ACCOUNT_LIST"),
    TRASH_ACCOUNT("TRASH_ACCOUNT"),
    LINK_POS_STOCK("LINK_POS_STOCK"),
    GET_CURRENCY_LIST("GET_CURRENCY_LIST"),
    ACTIVATE_UNIT("ACTIVATE_UNIT"),
    DEACTIVATE_UNIT("DEACTIVATE_UNIT");

    fun value() : String  = channel
}