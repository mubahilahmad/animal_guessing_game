package com.example.animal_guessing_game


data class Predator(
    override val name: String,
    override val hints: List<String>
) : AnimalInterface {
    companion object {
        val predators = listOf(
            Predator(
                "Lion",
                listOf(
                    "Color: Yellowish-brown",
                    "Habitat: Lives in Africa",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 3 meters long",
                    "Weight: 120 to 190 kg",
                    "Roars loudly",
                    "Has a mane",
                    "Very fast runner",
                    "Known as the King of the Jungle",
                    "Lives in groups called prides"
                )
            ),
            Predator(
                "Grizzly Bear",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in North America",
                    "Diet: Eats meat and plants (Omnivore)",
                    "Size: Up to 2.8 meters long",
                    "Weight: 180 to 360 kg",
                    "Strong and powerful",
                    "Excellent swimmer",
                    "Sleeps during the winter (hibernates)",
                    "Sharp claws for catching food",
                    "Loves to catch fish in rivers"
                )
            ),
            Predator(
                "Leopard",
                listOf(
                    "Color: Yellow with black spots",
                    "Habitat: Lives in Africa and Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2 meters long",
                    "Weight: 30 to 80 kg",
                    "Fast runner",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Strong and agile"
                )
            ),
            Predator(
                "Shark",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in oceans",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 12 meters long",
                    "Weight: 2000 to 3000 kg",
                    "Sharp teeth",
                    "Fast swimmer",
                    "Has fins",
                    "Apex predator",
                    "Cartilaginous skeleton"
                )
            ),
            Predator(
                "Wolf",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in forests",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.6 meters long",
                    "Weight: 23 to 80 kg",
                    "Howls",
                    "Pack animal",
                    "Fast and strong",
                    "Hunter",
                    "Alpha animal"
                )
            ),
            Predator(
                "Cheetah",
                listOf(
                    "Color: Yellow with black spots",
                    "Habitat: Lives in Africa",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.5 meters long",
                    "Weight: 21 to 72 kg",
                    "Fastest land animal",
                    "Small head",
                    "Long legs",
                    "Strong tail",
                    "Endangered species"
                )
            ),
            Predator(
                "Puma",
                listOf(
                    "Color: Brownish-yellow",
                    "Habitat: Lives in the Americas",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2.4 meters long",
                    "Weight: 29 to 90 kg",
                    "Also known as mountain lion",
                    "Solitary",
                    "Excellent jumper",
                    "Can run up to 40-50 mph",
                    "Elusive"
                )
            ),
            Predator(
                "Owl",
                listOf(
                    "Color: Brown and white",
                    "Habitat: Lives worldwide",
                    "Diet: Eats small animals (Carnivore)",
                    "Size: Up to 0.7 meters tall",
                    "Weight: 1 to 2 kg",
                    "Nocturnal bird",
                    "Excellent eyesight",
                    "Silent flight",
                    "Hoots",
                    "Sharp talons"
                )
            ),
            Predator(
                "Crocodile",
                listOf(
                    "Color: Greenish-brown",
                    "Habitat: Lives in rivers and swamps",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 5 meters long",
                    "Weight: 400 to 1000 kg",
                    "Strong bite",
                    "Can stay underwater for long",
                    "Lays eggs",
                    "Cold-blooded",
                    "Ambush predator"
                )
            ),
            Predator(
                "Fox",
                listOf(
                    "Color: Red",
                    "Habitat: Lives in forests and grasslands",
                    "Diet: Eats small animals and fruits (Omnivore)",
                    "Size: Up to 1 meter long",
                    "Weight: 4 to 9 kg",
                    "Bushy tail",
                    "Clever",
                    "Fast runner",
                    "Nocturnal",
                    "Lives alone or in pairs"
                )
            ),
            Predator(
                "Eagle",
                listOf(
                    "Color: Brown and white",
                    "Habitat: Lives worldwide",
                    "Diet: Eats fish and small animals (Carnivore)",
                    "Size: Up to 2.3 meters wingspan",
                    "Weight: 3 to 7 kg",
                    "Sharp eyesight",
                    "Strong talons",
                    "Builds large nests",
                    "Powerful flyer",
                    "Symbol of freedom"
                )
            ),
            Predator(
                "Falcon",
                listOf(
                    "Color: Gray and white",
                    "Habitat: Lives worldwide",
                    "Diet: Eats small animals (Carnivore)",
                    "Size: Up to 0.6 meters tall",
                    "Weight: 0.7 to 1.5 kg",
                    "Sharp beak",
                    "Strong talons",
                    "Excellent eyesight",
                    "Flies fast",
                    "Used in falconry"
                )
            ),
            Predator(
                "Hawk",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives worldwide",
                    "Diet: Eats small animals (Carnivore)",
                    "Size: Up to 0.7 meters tall",
                    "Weight: 0.5 to 1.5 kg",
                    "Sharp beak",
                    "Strong talons",
                    "Excellent eyesight",
                    "Flies high",
                    "Builds nests"
                )
            ),
            Predator(
                "Tiger",
                listOf(
                    "Color: Orange with black stripes",
                    "Habitat: Lives in Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 3.3 meters long",
                    "Weight: 65 to 300 kg",
                    "Strong and powerful",
                    "Good swimmer",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Hyena",
                listOf(
                    "Color: Brown with spots",
                    "Habitat: Lives in Africa and Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.8 meters long",
                    "Weight: 40 to 86 kg",
                    "Strong jaws",
                    "Lives in clans",
                    "Scavenger",
                    "Nocturnal",
                    "Communicates with laughs"
                )
            ),
            Predator(
                "Jaguar",
                listOf(
                    "Color: Yellow with black spots",
                    "Habitat: Lives in the Americas",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2.7 meters long",
                    "Weight: 56 to 96 kg",
                    "Strong swimmer",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Panther",
                listOf(
                    "Color: Black",
                    "Habitat: Lives in Africa, Asia, and the Americas",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2.7 meters long",
                    "Weight: 30 to 72 kg",
                    "Strong and agile",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Elusive"
                )
            ),
            Predator(
                "Polar Bear",
                listOf(
                    "Color: White",
                    "Habitat: Lives in the Arctic",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2.6 meters long",
                    "Weight: 350 to 700 kg",
                    "Strong swimmer",
                    "Thick fur",
                    "Lives on ice",
                    "Solitary",
                    "Endangered species"
                )
            ),
            Predator(
                "Snow Leopard",
                listOf(
                    "Color: White with black spots",
                    "Habitat: Lives in the mountains of Central Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.5 meters long",
                    "Weight: 22 to 55 kg",
                    "Strong and agile",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Dingo",
                listOf(
                    "Color: Tan",
                    "Habitat: Lives in Australia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.2 meters long",
                    "Weight: 13 to 20 kg",
                    "Wild dog",
                    "Lives in packs",
                    "Fast runner",
                    "Nocturnal",
                    "Hunter"
                )
            ),
            Predator(
                "Lynx",
                listOf(
                    "Color: Brown with spots",
                    "Habitat: Lives in Europe, Asia, and North America",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.3 meters long",
                    "Weight: 5 to 30 kg",
                    "Strong and agile",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Tufted ears"
                )
            ),
            Predator(
                "Komodo Dragon",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Indonesia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 3 meters long",
                    "Weight: 70 to 150 kg",
                    "Largest lizard",
                    "Venomous bite",
                    "Strong and powerful",
                    "Solitary",
                    "Endangered species"
                )
            ),
            Predator(
                "Siberian Tiger",
                listOf(
                    "Color: Orange with black stripes",
                    "Habitat: Lives in Siberia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 3.3 meters long",
                    "Weight: 100 to 300 kg",
                    "Strong and powerful",
                    "Good swimmer",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Great White Shark",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in oceans",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 6 meters long",
                    "Weight: 680 to 1100 kg",
                    "Sharp teeth",
                    "Fast swimmer",
                    "Has fins",
                    "Apex predator",
                    "Cartilaginous skeleton"
                )
            ),
            Predator(
                "Anaconda",
                listOf(
                    "Color: Green",
                    "Habitat: Lives in South America",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 9 meters long",
                    "Weight: 30 to 250 kg",
                    "Largest snake",
                    "Constrictor",
                    "Strong swimmer",
                    "Solitary",
                    "Lives in water"
                )
            ),
            Predator(
                "Cougar",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in the Americas",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 2.4 meters long",
                    "Weight: 29 to 90 kg",
                    "Also known as mountain lion",
                    "Solitary",
                    "Excellent jumper",
                    "Can run up to 40-50 mph",
                    "Elusive"
                )
            ),
            Predator(
                "Black Widow Spider",
                listOf(
                    "Color: Black with red hourglass",
                    "Habitat: Lives worldwide",
                    "Diet: Eats insects (Carnivore)",
                    "Size: Up to 0.04 meters long",
                    "Weight: 1 gram",
                    "Venomous bite",
                    "Strong web",
                    "Solitary",
                    "Nocturnal",
                    "Dangerous"
                )
            ),
            Predator(
                "Boa Constrictor",
                listOf(
                    "Color: Brown with dark patterns",
                    "Habitat: Lives in South America",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 4 meters long",
                    "Weight: 30 to 60 kg",
                    "Constrictor",
                    "Strong and powerful",
                    "Solitary",
                    "Nocturnal",
                    "Climbs trees"
                )
            ),
            Predator(
                "Piranha",
                listOf(
                    "Color: Silver with red",
                    "Habitat: Lives in South America",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 0.5 meters long",
                    "Weight: 3.5 kg",
                    "Sharp teeth",
                    "Fast swimmer",
                    "Lives in schools",
                    "Aggressive",
                    "Freshwater fish"
                )
            ),
            Predator(
                "Scorpion",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives worldwide",
                    "Diet: Eats insects (Carnivore)",
                    "Size: Up to 0.2 meters long",
                    "Weight: 1 gram",
                    "Venomous sting",
                    "Strong pincers",
                    "Solitary",
                    "Nocturnal",
                    "Lives in deserts"
                )
            ),
            Predator(
                "Mongoose",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Africa, Asia, and Europe",
                    "Diet: Eats small animals (Carnivore)",
                    "Size: Up to 0.6 meters long",
                    "Weight: 0.6 to 4 kg",
                    "Fast and agile",
                    "Good swimmer",
                    "Solitary",
                    "Nocturnal",
                    "Hunter"
                )
            ),
            Predator(
                "Tasmanian Devil",
                listOf(
                    "Color: Black",
                    "Habitat: Lives in Tasmania",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 0.6 meters long",
                    "Weight: 6 to 8 kg",
                    "Strong jaws",
                    "Noisy",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Bald Eagle",
                listOf(
                    "Color: White head and brown body",
                    "Habitat: Lives in North America",
                    "Diet: Eats fish and small animals (Carnivore)",
                    "Size: Up to 2.3 meters wingspan",
                    "Weight: 3 to 6.3 kg",
                    "Sharp eyesight",
                    "Strong talons",
                    "Builds large nests",
                    "Powerful flyer",
                    "Symbol of freedom"
                )
            ),
            Predator(
                "Wolverine",
                listOf(
                    "Color: Brown with yellow stripes",
                    "Habitat: Lives in the Northern Hemisphere",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.1 meters long",
                    "Weight: 9 to 25 kg",
                    "Strong and powerful",
                    "Good climber",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Jaguarundi",
                listOf(
                    "Color: Brown or gray",
                    "Habitat: Lives in the Americas",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 0.75 meters long",
                    "Weight: 3 to 9 kg",
                    "Strong and agile",
                    "Good climber",
                    "Solitary",
                    "Nocturnal",
                    "Elusive"
                )
            ),
            Predator(
                "Killer Whale",
                listOf(
                    "Color: Black and white",
                    "Habitat: Lives in oceans",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 9.8 meters long",
                    "Weight: 5400 kg",
                    "Sharp teeth",
                    "Fast swimmer",
                    "Lives in pods",
                    "Intelligent",
                    "Apex predator"
                )
            ),
            Predator(
                "Alligator",
                listOf(
                    "Color: Greenish-black",
                    "Habitat: Lives in the southeastern United States and China",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 4.5 meters long",
                    "Weight: 230 kg",
                    "Strong bite",
                    "Can stay underwater for long",
                    "Lays eggs",
                    "Cold-blooded",
                    "Ambush predator"
                )
            ),
            Predator(
                "Tasmanian Tiger",
                listOf(
                    "Color: Brown with dark stripes",
                    "Habitat: Lived in Tasmania",
                    "Diet: Ate meat (Carnivore)",
                    "Size: Up to 1.8 meters long",
                    "Weight: 30 kg",
                    "Strong jaws",
                    "Noisy",
                    "Solitary",
                    "Nocturnal",
                    "Extinct species"
                )
            ),
            Predator(
                "Harpy Eagle",
                listOf(
                    "Color: Black and white",
                    "Habitat: Lives in Central and South America",
                    "Diet: Eats monkeys and sloths (Carnivore)",
                    "Size: Up to 2 meters wingspan",
                    "Weight: 6 to 10 kg",
                    "Strong talons",
                    "Excellent eyesight",
                    "Builds large nests",
                    "Powerful flyer",
                    "Endangered species"
                )
            ),
            Predator(
                "Spectacled Bear",
                listOf(
                    "Color: Black with white face markings",
                    "Habitat: Lives in South America",
                    "Diet: Eats meat and plants (Omnivore)",
                    "Size: Up to 1.8 meters long",
                    "Weight: 100 to 200 kg",
                    "Strong climber",
                    "Good swimmer",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Siberian Lynx",
                listOf(
                    "Color: Brown with spots",
                    "Habitat: Lives in Siberia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.3 meters long",
                    "Weight: 8 to 38 kg",
                    "Strong and agile",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "African Wild Dog",
                listOf(
                    "Color: Mottled coat",
                    "Habitat: Lives in Africa",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.5 meters long",
                    "Weight: 18 to 36 kg",
                    "Lives in packs",
                    "Fast runner",
                    "Nocturnal",
                    "Hunter",
                    "Endangered species"
                )
            ),
            Predator(
                "Dhole",
                listOf(
                    "Color: Reddish-brown",
                    "Habitat: Lives in Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.1 meters long",
                    "Weight: 10 to 20 kg",
                    "Lives in packs",
                    "Fast runner",
                    "Nocturnal",
                    "Hunter",
                    "Endangered species"
                )
            ),
            Predator(
                "Clouded Leopard",
                listOf(
                    "Color: Yellow with cloud-shaped spots",
                    "Habitat: Lives in Asia",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 1.1 meters long",
                    "Weight: 11 to 23 kg",
                    "Strong and agile",
                    "Climbs trees",
                    "Solitary",
                    "Nocturnal",
                    "Endangered species"
                )
            ),
            Predator(
                "Honey Badger",
                listOf(
                    "Color: Black and white",
                    "Habitat: Lives in Africa, Asia, and India",
                    "Diet: Eats meat and plants (Omnivore)",
                    "Size: Up to 0.77 meters long",
                    "Weight: 9 to 16 kg",
                    "Fearless",
                    "Strong and powerful",
                    "Good climber",
                    "Solitary",
                    "Nocturnal"
                )
            )
        )
    }
}

