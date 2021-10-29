package com.murallaromana.proyectorecyclesview.model.data

import com.murallaromana.proyectorecyclesview.model.entities.Personaje

class PersonajesDaoMockImpl : PersonajesDao {

    override fun getTodos() = listOf(
        Personaje(
            0,
            "jonh",
            "nieve",
            "pringao",
            "bastardo",
            "https://thronesapi.com/assets/images/jon-snow.jpg"
        ),
        Personaje(
            0,
            "Daenerys",
            "dragonera",
            "pringao",
            "casa dragonesssss",
            "https://thronesapi.com/assets/images/daenerys.jpg"
        ),
        Personaje(
            0,
            "Arya ",
            "Stark",
            "jefa",
            "casa stark",
            "https://thronesapi.com/assets/images/arya-stark.jpg"
        ),
        Personaje(
            0,
            "Brandon",
            "Stark",
            "cuervo",
            "casa Stark",
            "https://thronesapi.com/assets/images/bran-stark.jpg"
        )
    )
}


/*      Otra forma de hacerlo
        return listOf(
            Personaje(
                0,
                "jonh",
                "nieve",
                "pringao",
                "bastardo",
                "https://thronesapi.com/assets/images/jon-snow.jpg"
            ),
            Personaje(
                0,
                "Daenerys",
                "dragonera",
                "pringao",
                "bastardo",
                "https://thronesapi.com/assets/images/daenerys.jpg"
            ),
            Personaje(
                0,
                "Arya ",
                "Stark",
                "jefa",
                "stark",
                "https://thronesapi.com/assets/images/arya-stark.jpg"
            ),
            Personaje(
                0,
                "Brandon",
                "Stark",
                "amish",
                "Stark",
                "https://thronesapi.com/assets/images/bran-stark.jpg"
            )
        )

    }
}*/