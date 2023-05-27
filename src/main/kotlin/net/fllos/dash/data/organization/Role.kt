package net.fllos.dash.data.organization

data class Role(val id: String, val name: String, val permissions: MutableList<String>)