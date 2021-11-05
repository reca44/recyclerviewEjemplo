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
            "https://s1.1zoom.me/big3/471/Painting_Art_Back_view_Photographer_575380_3840x2400.jpg"
        ),
        Personaje(
            0,
            "Daenerys",
            "dragonera",
            "pringao",
            "casa dragonesssss",
            "https://staticwebsitesmicroblog.blob.core.windows.net/images/rsseitor/extern-imagesimagenestopnet/imagenes-de-whatsapp-0.jpg"
        ),
        Personaje(
            0,
            "Arya ",
            "Stark",
            "jefa",
            "casa stark",
            "https://media.traveler.es/photos/613760adcb06ad0f20e11980/master/w_1600%2Cc_limit/202931.jpg"
        ),
        Personaje(
            0,
            "Brandon",
            "Stark",
            "cuervo",
            "casa Stark",
            "https://phantom-expansion.unidadeditorial.es/04d5a7930d32e4860ba7cf82291b9d30/resize/640/assets/multimedia/imagenes/2021/03/18/16160714974849.jpg"
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