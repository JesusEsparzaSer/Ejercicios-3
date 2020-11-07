
Jesús Esparza serna

jesusesparza07serna@gmail.com

--------------------------------2.Akinator---------------------------------------
1.Agregue este script en una conexión de mysql

CREATE DATABASE animals;

USE animals;

CREATE TABLE `animal` ( `id` int(11) NOT NULL AUTO_INCREMENT,
 `nombre` varchar(45) NOT NULL,
 `pelo` int(11) NOT NULL,
 `plumas` int(11) NOT NULL,
 `huevo` int(11) NOT NULL, 
 `vuela` int(11) NOT NULL,
 `nada` int(11) NOT NULL,
 `depredador` int(11) NOT NULL,
 `dientes` int(11) NOT NULL,
 `vertebrado` int(11) NOT NULL,
 `venenoso` int(11) NOT NULL,
 `aletas` int(11) NOT NULL,
 `patas` int(11) NOT NULL,
 `cola` int(11) NOT NULL, 
 `domestico` int(11) NOT NULL,
 `extra` varchar(45) NOT NULL, PRIMARY KEY (`id`) ) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8;*/
 INSERT INTO `animal` VALUES (205,' puerco hormiguero',1,0,0,0,0,1,1,1,0,0,4,0,0,'come hormigas'),
 (206,' antilope',1,0,0,0,0,0,1,1,0,0,4,1,0,'posee cuernos huecos'),
 (207,' foca',0,0,1,0,1,1,1,1,0,1,0,1,0,'su piel esta cubierta con grasa'),
 (208,' oso',1,0,0,0,0,1,1,1,0,0,4,0,0,'es famoso por su abrazo mortal'),
 (209,' jabali',1,0,0,0,0,1,1,1,0,0,4,1,0,'tiene relaciones con el cerdo de granja'),
 (210,' bufalo',1,0,0,0,0,0,1,1,0,0,4,1,0,'se asemeja al toro'),
 (211,' ternero',1,0,0,0,0,0,1,1,0,0,4,1,1,'se asemeja a la res de granja'),
 (212,' carpa',0,0,1,0,1,0,1,1,0,1,0,1,1,'tipo de pez de agua dulce'),
 (213,' bagre',0,0,1,0,1,1,1,1,0,1,0,1,0,'tipo de pez sin escamas'),
 (214,' pollo',0,1,1,1,0,0,0,1,0,0,2,1,1,'se crían en granjas'),
 (215,' almeja',0,0,1,0,0,1,0,0,0,0,0,0,0,'molusco protegido por dos conchas'),
 (216,' cangrejo',0,0,1,0,1,1,0,0,0,0,4,0,0,'caminan de lado'),
 (217,' cuervo',0,1,1,1,0,1,0,1,0,0,2,1,0,'comunmente de color negro'),
 (218,' ciervo',1,0,0,0,0,0,1,1,0,0,4,1,0,'es bambi'),
 (219,' delfin',0,0,0,0,1,1,1,1,0,1,0,1,0,'es muy inteligente'),
 (220,' paloma',0,1,1,1,0,0,0,1,0,0,2,1,1,'es comestible en Peru'),
 (221,' pato',0,1,1,1,1,0,0,1,0,0,2,1,0,'tiene el pico aplanado'),
 (222,' elefante',1,0,0,0,0,0,1,1,0,0,4,1,0,'es el animal terrestre mas pesado'),
 (223,' flamenco',0,1,1,1,0,0,0,1,0,0,2,1,0,'le gusta posar sobre una pata'),
 (224,' pulga',0,0,1,0,0,0,0,0,0,0,6,0,0,'le gusta molestar a los perros'),
 (225,' rana',0,0,1,0,1,1,1,1,0,0,4,0,0,'anfibio que nace sin patas'),
 (226,' jirafa',1,0,0,0,0,0,1,1,0,0,4,1,0,'famosa por su largo cuello'),
 (227,' mosquito',0,0,1,1,0,0,0,0,0,0,6,0,0,'es transmisor del dengue'),
 (228,' cabra',1,0,0,0,0,0,1,1,0,0,4,1,1,'le gusta brincar en las montañas'),
 (229,' gorila',1,0,0,0,0,0,1,1,0,0,2,0,0,'criaron a Tarzan'),
 (230,' gaviota',0,1,1,1,1,1,0,1,0,0,2,1,0,'la esposa de Lord Peña'),
 (231,' hamster',1,0,0,0,0,0,1,1,0,0,4,1,1,'protagonista de la serie Hamtaro'),
 (232,' liebre',1,0,0,0,0,0,1,1,0,0,4,1,0,'es un roedor muy rápido'),
 (233,' halcon',0,1,1,1,0,1,0,1,0,0,2,1,0,'extraordinaria vision desde lejos'),
 (234,' abeja',1,0,1,1,0,0,0,0,1,0,6,0,1,'cosecha miel'),
 (235,' mosca',1,0,1,1,0,0,0,0,0,0,6,0,0,'es muy molesta para los humanos'),
 (236,' mariquita',0,0,1,1,0,1,0,0,0,0,6,0,0,'programa en html'),
 (237,' leopardo',1,0,0,0,0,1,1,1,0,0,4,1,0,'tiene manchas'),
 (238,' leon',1,0,0,0,0,1,1,1,0,0,4,1,0,'tiene melena'),
 (239,' langosta',0,0,1,0,1,1,0,0,0,0,6,0,0,'tiene tenazas'),
 (240,' lince',1,0,0,0,0,1,1,1,0,0,4,1,0,'tiene orejas puntiagudas'),
 (241,' polilla',1,0,1,1,0,0,0,0,0,0,6,0,0,'es nocturno'),
 (242,' triton',0,0,1,0,1,1,1,1,0,0,4,1,0,'tiene patas'),
 (243,' pulpo',0,0,1,0,1,1,0,0,0,0,8,0,0,'tiene tentaculos'),
 (244,' zarigueya',1,0,0,0,0,1,1,1,0,0,4,1,0,'sin pelo en la cola'),
 (245,' avestruz',0,1,1,0,0,0,0,1,0,0,2,1,0,'tiene cuello largo'),
 (246,' perico',0,1,1,1,0,0,0,1,0,0,2,1,1,'habla'),
 (247,' pinguino',0,1,1,0,1,1,0,1,0,0,2,1,0,'usa traje'),
 (248,' pirania',0,0,1,0,1,1,1,1,0,1,0,1,0,'vive en el amazonas'),
 (249,' ornitorrinco',1,0,1,0,1,1,0,1,0,0,4,1,0,'es perry'),
 (250,' pony',1,0,0,0,0,0,1,1,0,0,4,1,1,'es de patas cortas'),
 (251,' puma',1,0,0,0,0,1,1,1,0,0,4,1,0,'vive en las montañas'),
 (252,' gato',1,0,0,0,0,1,1,1,0,0,4,1,1,'maulla'),
 (253,' mapache',1,0,0,0,0,1,1,1,0,0,4,1,0,'usa antifaz'),
 (254,' reno',1,0,0,0,0,0,1,1,0,0,4,1,1,'es de nariz roja'),
 (255,' escorpion',0,0,0,0,0,1,0,0,1,0,8,1,0,'tiene pinsas'),
 (256,' caballito de mar',0,0,1,0,1,0,1,1,0,1,0,1,0,'parece caballo'),
 (257,' serpiente',0,0,0,0,1,1,1,1,1,0,0,1,0,'no tiene patas'),
 (258,' medusa',0,0,1,0,1,1,0,0,1,0,0,0,0,'no tiene cerebro'),
 (259,' lombriz',0,0,1,0,0,1,1,1,0,0,0,1,0,'es rosado'),
 (260,' babosa',0,0,1,0,0,0,0,0,0,0,0,0,0,'suelta mucosidad'),
 (261,' gorrion',0,1,1,1,0,0,0,1,0,0,2,1,0,'es un gorrion'),
 (262,' ardilla',1,0,0,0,0,0,1,1,0,0,2,1,0,'come nueces'),
 (263,' estrella de mar',0,0,1,0,1,1,0,0,0,0,5,0,0,'es amigo de bob esponja'),
 (264,' mantarraya',0,0,1,0,1,1,1,1,1,1,0,1,0,'es un pez aplanado'),
 (265,' cisne',0,1,1,1,1,0,0,1,0,0,2,1,0,'parece un pato'),
 (266,' termita',0,0,1,0,0,0,0,0,0,0,6,0,0,'come madera'),
 (267,' sapo',0,0,1,0,1,0,1,1,0,0,4,0,0,'come moscas'),
 (268,' atun',0,0,1,0,1,1,1,1,0,1,0,1,0,'tiene aletas amarillas'),
 (269,' murcielago',1,0,0,1,0,0,1,1,0,0,2,1,0,'vuela de noche'),
 (270,' buitre',0,1,1,1,0,1,0,1,0,0,2,1,0,'come carne podrida'),
 (271,' canguro',1,0,0,0,0,0,1,1,0,0,2,1,0,'es un marsupial'),
 (272,' avispa',1,0,1,1,0,0,0,0,1,0,6,0,0,'pica'),
 (273,' lobo',1,0,0,0,0,1,1,1,0,0,4,1,0,'aulla'),
 (274,' gusano',0,0,1,0,0,0,0,0,0,0,0,0,0,'se convierte en capullo');

2.- En el archivo Sql.java agregue la direccion en la variable cnn, en este caso solo verifique el nombre
public Sql() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/animals", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
3.-Agregue la libreria MySQL JDBC Driver en la carpeta Libraries
4.-Corra el programa