package com.example.animal_guessing_game


data class Animal(
    override val name: String,
    override val hints: List<String>
) : AnimalInterface {
    companion object {
        val animals = listOf(
            Animal(
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
            Animal(
                "Giraffe",
                listOf(
                    "Color: Yellow with brown spots",
                    "Habitat: Lives in Africa",
                    "Diet: Eats leaves (Herbivore)",
                    "Size: Up to 6 meters tall",
                    "Weight: 800 to 1200 kg",
                    "Has a very long neck",
                    "Gentle and calm",
                    "Uses long tongue to grab leaves",
                    "Long legs help it run fast",
                    "Good eyesight to see far distances"
                )
            ),
            Animal(
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
            Animal(
                "Peacock",
                listOf(
                    "Color: Colorful feathers",
                    "Habitat: Lives in Asia",
                    "Diet: Eats plants and small animals (Omnivore)",
                    "Size: Up to 2.3 meters long",
                    "Weight: 4 to 6 kg",
                    "Displays feathers in a fan shape",
                    "Makes loud calls",
                    "Can fly short distances",
                    "Lives on the ground",
                    "Known for beautiful tail"
                )
            ),
            Animal(
                "Chimpanzee",
                listOf(
                    "Color: Black",
                    "Habitat: Lives in Africa",
                    "Diet: Eats fruits and insects (Omnivore)",
                    "Size: Up to 1.7 meters tall",
                    "Weight: 40 to 60 kg",
                    "Very intelligent",
                    "Uses tools",
                    "Lives in groups",
                    "Can climb trees",
                    "Communicates with sounds"
                )
            ),
            Animal(
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
            Animal(
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
            Animal(
                "Rabbit",
                listOf(
                    "Color: Soft fur",
                    "Habitat: Lives in burrows",
                    "Diet: Eats vegetables (Herbivore)",
                    "Size: Up to 0.5 meters long",
                    "Weight: 1 to 2 kg",
                    "Long ears",
                    "Hops",
                    "Fast breeder",
                    "Timid",
                    "Lives in groups"
                )
            ),
            Animal(
                "Bat",
                listOf(
                    "Color: Brown or black",
                    "Habitat: Lives in caves",
                    "Diet: Eats insects (Insectivore)",
                    "Size: Up to 0.4 meters wingspan",
                    "Weight: 0.02 to 0.1 kg",
                    "Nocturnal",
                    "Uses echolocation",
                    "Can hang upside down",
                    "Flies",
                    "Social animal"
                )
            ),
            Animal(
                "Horse",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives on farms",
                    "Diet: Eats grass (Herbivore)",
                    "Size: Up to 1.8 meters tall",
                    "Weight: 380 to 1000 kg",
                    "Strong and fast",
                    "Used for riding",
                    "Has a mane and tail",
                    "Domesticated",
                    "Hooves"
                )
            ),
            Animal(
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
            Animal(
                "Parrot",
                listOf(
                    "Color: Colorful feathers",
                    "Habitat: Lives in tropical regions",
                    "Diet: Eats fruits and nuts (Omnivore)",
                    "Size: Up to 1 meter long",
                    "Weight: 1 to 2 kg",
                    "Mimics sounds",
                    "Strong beak",
                    "Can climb",
                    "Lives in flocks",
                    "Long lifespan"
                )
            ),
            Animal(
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
            Animal(
                "Whale",
                listOf(
                    "Color: Gray or blue",
                    "Habitat: Lives in oceans",
                    "Diet: Eats small fish and plankton (Carnivore)",
                    "Size: Up to 30 meters long",
                    "Weight: 20000 to 30000 kg",
                    "Echolocation",
                    "Has a blowhole",
                    "Social animal",
                    "Long lifespan",
                    "Large size"
                )
            ),
            Animal(
                "Deer",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in forests",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 1.2 meters tall",
                    "Weight: 30 to 300 kg",
                    "Has antlers",
                    "Graceful and fast",
                    "Timid",
                    "Hooves",
                    "Lives in herds"
                )
            ),
            Animal(
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
            Animal(
                "Seal",
                listOf(
                    "Color: Gray or brown",
                    "Habitat: Lives in cold oceans",
                    "Diet: Eats fish (Carnivore)",
                    "Size: Up to 2 meters long",
                    "Weight: 100 to 300 kg",
                    "Has flippers",
                    "Playful and social",
                    "Barks",
                    "Swims well",
                    "Has blubber"
                )
            ),
            Animal(
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
            Animal(
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
            Animal(
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
            Animal(
                "Raccoon",
                listOf(
                    "Color: Gray with black mask",
                    "Habitat: Lives in North America",
                    "Diet: Eats anything (Omnivore)",
                    "Size: Up to 0.6 meters long",
                    "Weight: 5 to 23 kg",
                    "Clever",
                    "Nocturnal",
                    "Climbs well",
                    "Lives in forests and urban areas",
                    "Social animal"
                )
            ),
            Animal(
                "Lemur",
                listOf(
                    "Color: Gray or brown",
                    "Habitat: Lives in Madagascar",
                    "Diet: Eats fruits and leaves (Omnivore)",
                    "Size: Up to 0.5 meters long",
                    "Weight: 0.7 to 4.5 kg",
                    "Large eyes",
                    "Nocturnal",
                    "Very social",
                    "Climbs well",
                    "Endangered species"
                )
            ),
            Animal(
                "Octopus",
                listOf(
                    "Color: Soft body",
                    "Habitat: Lives in oceans",
                    "Diet: Eats meat (Carnivore)",
                    "Size: Up to 4 meters long",
                    "Weight: 3 to 10 kg",
                    "Eight arms",
                    "Intelligent",
                    "Can camouflage",
                    "Uses ink for defense",
                    "Lives alone"
                )
            ),
            Animal(
                "Flamingo",
                listOf(
                    "Color: Pink",
                    "Habitat: Lives in tropical and subtropical regions",
                    "Diet: Eats algae and crustaceans (Herbivore)",
                    "Size: Up to 1.5 meters tall",
                    "Weight: 2 to 4 kg",
                    "Long legs",
                    "Long neck",
                    "Wades in water",
                    "Lives in groups",
                    "Graceful"
                )
            ),
            Animal(
                "Elephant",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Africa and Asia",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 4 meters tall",
                    "Weight: 3000 to 6000 kg",
                    "Has large ears",
                    "Long trunk",
                    "Has tusks",
                    "Very intelligent",
                    "Social animal"
                )
            ),
            Animal(
                "Dog",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives in homes",
                    "Diet: Eats dog food (Omnivore)",
                    "Size: Up to 0.9 meters tall",
                    "Weight: 5 to 50 kg",
                    "Barks",
                    "Loyal companion",
                    "Many breeds",
                    "Can be trained",
                    "Guard animal"
                )
            ),
            Animal(
                "Cat",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives in homes",
                    "Diet: Eats cat food (Carnivore)",
                    "Size: Up to 0.5 meters tall",
                    "Weight: 3 to 7 kg",
                    "Meows",
                    "Independent",
                    "Many breeds",
                    "Purrs",
                    "Climbs well"
                )
            ),
            Animal(
                "Cow",
                listOf(
                    "Color: Black and white or brown",
                    "Habitat: Lives on farms",
                    "Diet: Eats grass (Herbivore)",
                    "Size: Up to 1.5 meters tall",
                    "Weight: 400 to 800 kg",
                    "Provides milk",
                    "Lives in herds",
                    "Domesticated",
                    "Grazes",
                    "Used for meat and dairy"
                )
            ),
            Animal(
                "Pig",
                listOf(
                    "Color: Pink or black",
                    "Habitat: Lives on farms",
                    "Diet: Eats plants and scraps (Omnivore)",
                    "Size: Up to 0.9 meters tall",
                    "Weight: 50 to 350 kg",
                    "Oinks",
                    "Intelligent",
                    "Lives in pens",
                    "Used for meat",
                    "Has a snout"
                )
            ),
            Animal(
                "Sheep",
                listOf(
                    "Color: White or black",
                    "Habitat: Lives on farms",
                    "Diet: Eats grass (Herbivore)",
                    "Size: Up to 1 meter tall",
                    "Weight: 45 to 100 kg",
                    "Provides wool",
                    "Lives in flocks",
                    "Baas",
                    "Domesticated",
                    "Used for meat and wool"
                )
            ),
            Animal(
                "Goat",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives on farms",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 1 meter tall",
                    "Weight: 20 to 140 kg",
                    "Provides milk",
                    "Has horns",
                    "Climbs well",
                    "Lives in herds",
                    "Used for meat and milk"
                )
            ),
            Animal(
                "Chicken",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives on farms",
                    "Diet: Eats grains (Omnivore)",
                    "Size: Up to 0.6 meters tall",
                    "Weight: 1 to 3 kg",
                    "Lays eggs",
                    "Clucks",
                    "Lives in flocks",
                    "Has feathers",
                    "Used for meat and eggs"
                )
            ),
            Animal(
                "Duck",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives near water",
                    "Diet: Eats plants and insects (Omnivore)",
                    "Size: Up to 0.6 meters tall",
                    "Weight: 1 to 4 kg",
                    "Quacks",
                    "Swims well",
                    "Lays eggs",
                    "Has webbed feet",
                    "Lives in flocks"
                )
            ),
            Animal(
                "Turkey",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives on farms",
                    "Diet: Eats grains and insects (Omnivore)",
                    "Size: Up to 1 meter tall",
                    "Weight: 5 to 11 kg",
                    "Gobble sound",
                    "Large bird",
                    "Has a fan-shaped tail",
                    "Lays eggs",
                    "Used for meat"
                )
            ),
            Animal(
                "Goose",
                listOf(
                    "Color: White or gray",
                    "Habitat: Lives near water",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 1 meter tall",
                    "Weight: 3 to 9 kg",
                    "Honk sound",
                    "Migrates",
                    "Lays eggs",
                    "Has webbed feet",
                    "Lives in flocks"
                )
            ),
            Animal(
                "Hamster",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives in cages",
                    "Diet: Eats grains and vegetables (Herbivore)",
                    "Size: Up to 0.1 meters long",
                    "Weight: 0.03 to 0.2 kg",
                    "Popular pet",
                    "Nocturnal",
                    "Runs on wheels",
                    "Has cheek pouches",
                    "Small and cute"
                )
            ),
            Animal(
                "Guinea Pig",
                listOf(
                    "Color: Various colors",
                    "Habitat: Lives in cages",
                    "Diet: Eats hay and vegetables (Herbivore)",
                    "Size: Up to 0.3 meters long",
                    "Weight: 0.7 to 1.2 kg",
                    "Popular pet",
                    "Whistles",
                    "Lives in groups",
                    "No tail",
                    "Furry"
                )
            ),
            Animal(
                "Mouse",
                listOf(
                    "Color: Gray or white",
                    "Habitat: Lives in burrows",
                    "Diet: Eats grains (Omnivore)",
                    "Size: Up to 0.1 meters long",
                    "Weight: 0.02 to 0.03 kg",
                    "Squeaks",
                    "Fast",
                    "Nocturnal",
                    "Small size",
                    "Used in labs"
                )
            ),
            Animal(
                "Rat",
                listOf(
                    "Color: Gray or brown",
                    "Habitat: Lives in burrows",
                    "Diet: Eats grains and scraps (Omnivore)",
                    "Size: Up to 0.3 meters long",
                    "Weight: 0.2 to 0.5 kg",
                    "Squeaks",
                    "Fast",
                    "Nocturnal",
                    "Larger than mice",
                    "Used in labs"
                )
            ),
            Animal(
                "Pigeon",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in cities",
                    "Diet: Eats seeds and scraps (Omnivore)",
                    "Size: Up to 0.4 meters tall",
                    "Weight: 0.2 to 0.4 kg",
                    "Coos",
                    "Flies well",
                    "Builds nests",
                    "Common bird",
                    "Used in racing"
                )
            ),
            Animal(
                "Sparrow",
                listOf(
                    "Color: Brown and gray",
                    "Habitat: Lives worldwide",
                    "Diet: Eats seeds and insects (Omnivore)",
                    "Size: Up to 0.2 meters tall",
                    "Weight: 0.02 to 0.04 kg",
                    "Chirps",
                    "Flies well",
                    "Builds nests",
                    "Common bird",
                    "Fast flyer"
                )
            ),
            Animal(
                "Crow",
                listOf(
                    "Color: Black",
                    "Habitat: Lives worldwide",
                    "Diet: Eats anything (Omnivore)",
                    "Size: Up to 0.5 meters tall",
                    "Weight: 0.3 to 0.6 kg",
                    "Caws",
                    "Very intelligent",
                    "Builds nests",
                    "Flies well",
                    "Social bird"
                )
            ),
            Animal(
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
            Animal(
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
            Animal(
                "Swan",
                listOf(
                    "Color: White",
                    "Habitat: Lives near water",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 1.5 meters tall",
                    "Weight: 5 to 15 kg",
                    "Long neck",
                    "Graceful",
                    "Flies well",
                    "Builds nests",
                    "Monogamous"
                )
            ),
            Animal(
                "Ostrich",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in Africa",
                    "Diet: Eats plants and insects (Omnivore)",
                    "Size: Up to 2.8 meters tall",
                    "Weight: 100 to 150 kg",
                    "Flightless",
                    "Runs very fast",
                    "Long legs",
                    "Lays large eggs",
                    "Has a long neck"
                )
            ),
            Animal(
                "Rhino",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Africa and Asia",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 4 meters long",
                    "Weight: 800 to 1400 kg",
                    "Has a horn",
                    "Very strong",
                    "Endangered",
                    "Thick skin",
                    "Heavy"
                )
            ),
            Animal(
                "Hippo",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Africa",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 5 meters long",
                    "Weight: 1300 to 3200 kg",
                    "Semi-aquatic",
                    "Very strong",
                    "Aggressive",
                    "Large mouth",
                    "Lives in groups"
                )
            ),
            Animal(
                "Buffalo",
                listOf(
                    "Color: Black or brown",
                    "Habitat: Lives in Africa and North America",
                    "Diet: Eats grass (Herbivore)",
                    "Size: Up to 3.4 meters long",
                    "Weight: 300 to 900 kg",
                    "Very strong",
                    "Lives in herds",
                    "Domesticated",
                    "Provides meat and milk",
                    "Thick fur"
                )
            ),
            Animal(
                "Antelope",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in Africa",
                    "Diet: Eats grass (Herbivore)",
                    "Size: Up to 1.5 meters tall",
                    "Weight: 40 to 60 kg",
                    "Graceful",
                    "Fast runner",
                    "Has horns",
                    "Timid",
                    "Lives in herds"
                )
            ),
            Animal(
                "Meerkat",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in Africa",
                    "Diet: Eats insects and plants (Omnivore)",
                    "Size: Up to 0.5 meters tall",
                    "Weight: 0.6 to 1 kg",
                    "Stands on hind legs",
                    "Lives in burrows",
                    "Very social",
                    "Curious",
                    "Fast"
                )
            ),
            Animal(
                "Gorilla",
                listOf(
                    "Color: Black",
                    "Habitat: Lives in Africa",
                    "Diet: Eats plants (Herbivore)",
                    "Size: Up to 1.8 meters tall",
                    "Weight: 100 to 270 kg",
                    "Very strong",
                    "Intelligent",
                    "Lives in groups",
                    "Builds nests",
                    "Endangered"
                )
            ),
            Animal(
                "Orangutan",
                listOf(
                    "Color: Orange",
                    "Habitat: Lives in Asia",
                    "Diet: Eats fruits and leaves (Herbivore)",
                    "Size: Up to 1.5 meters tall",
                    "Weight: 30 to 100 kg",
                    "Intelligent",
                    "Long arms",
                    "Solitary",
                    "Builds nests",
                    "Endangered"
                )
            ),
            Animal(
                "Koala",
                listOf(
                    "Color: Gray",
                    "Habitat: Lives in Australia",
                    "Diet: Eats eucalyptus leaves (Herbivore)",
                    "Size: Up to 0.85 meters tall",
                    "Weight: 4 to 15 kg",
                    "Very cute",
                    "Sleeps a lot",
                    "Has a pouch",
                    "Lives in trees",
                    "Slow mover"
                )
            ),
            Animal(
                "Hedgehog",
                listOf(
                    "Color: Brown",
                    "Habitat: Lives in Europe, Asia, and Africa",
                    "Diet: Eats insects (Insectivore)",
                    "Size: Up to 0.3 meters long",
                    "Weight: 0.5 to 1.2 kg",
                    "Rolls into a ball",
                    "Nocturnal",
                    "Timid",
                    "Very cute",
                    "Lives alone"
                )
            ),

            )
    }
}