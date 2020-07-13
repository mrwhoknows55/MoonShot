package com.haroldadmin.moonshot.services.spacex.v4.test

import com.haroldadmin.moonshot.services.spacex.v4.*

object APISampleData {

    object Capsules {
        fun samples(): Sequence<Capsule> {
            return generateSequence {
                Capsule(
                    reuseCount = 1,
                    waterLandings = 1,
                    landLandings = 0,
                    lastUpdate = "Reentered after three weeks in orbit",
                    launchIDs = listOf("5eb87cdeffd86e000604b330"),
                    serial = "C101",
                    status = Capsule.CapsuleStatus.retired,
                    id = "5e9e2c5bf35918ed873b2664",
                    dragon = null
                )
            }
        }
    }

    object Company {
        fun samples(): Sequence<CompanyInfo> {
            return generateSequence {
                CompanyInfo(
                    headquarters = CompanyInfo.Headquarters(
                        address = "Rocket Road",
                        city = "Hawthorne",
                        state = "California"
                    ),
                    links = CompanyInfo.Links(
                        website = "https://www.spacex.com/",
                        flickr = "https://www.flickr.com/photos/spacex/",
                        twitter = "https://twitter.com/SpaceX",
                        elonTwitter = "https://twitter.com/elonmusk"
                    ),
                    name = "SpaceX",
                    founder = "Elon Musk",
                    founded = 2002,
                    employees = 8000,
                    vehicles = 3,
                    launchSites = 3,
                    testSites = 1,
                    ceo = "Elon Musk",
                    cto = "Elon Musk",
                    coo = "Gwynne Shotwell",
                    ctoPropulsion = "Tom Mueller",
                    valuation = 52000000000.0,
                    summary = "SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.",
                    id = "5eb75edc42fea42237d7f3ed"
                )
            }
        }
    }

    object Cores {
        fun samples(): Sequence<Core> {
            return generateSequence {
                Core(
                    block = 5,
                    reuseCount = 3,
                    rtlsAttempts = 1,
                    rtlsLandings = 1,
                    asdsAttempts = 3,
                    asdsLandings = 3,
                    lastUpdate = "Landed on OCISLY as of Jan 29, 2020. ",
                    launchIDs = listOf(
                        "5eb87d2bffd86e000604b375",
                        "5eb87d31ffd86e000604b379",
                        "5eb87d3fffd86e000604b382",
                        "5eb87d44ffd86e000604b386"
                    ),
                    serial = "B1051",
                    status = CoreStatus.active,
                    id = "5e9e28a6f35918c0803b265c"
                )
            }
        }
    }

    object Crews {
        fun samples(): Sequence<Crew> {
            return generateSequence {
                Crew(
                    name = "Douglas Hurley",
                    agency = "NASA",
                    image = "https://i.imgur.com/ooaayWf.png",
                    wikipedia = "https://en.wikipedia.org/wiki/Douglas_G._Hurley",
                    launchIDs = listOf("5eb87d46ffd86e000604b388"),
                    status = CrewStatus.active,
                    id = "5ebf1b7323a9a60006e03a7b"
                )
            }
        }
    }
}