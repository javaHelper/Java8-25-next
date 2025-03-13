package com.pluralsight.streamslambdas.examples;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

public class ExampleData {

    public static Airline QUICK_AIR = new Airline("QA", "Quick Air");
    public static Airline BLUE_AIR = new Airline("BA", "Blue Air");
    public static Airline RED_LINE = new Airline("RL", "Red Line");
    public static Airline GREEN_FLIGHTS = new Airline("GF", "Green Flights");

    public static List<Flight> FLIGHTS = List.of(
            new Flight(911, BLUE_AIR, "Madrid", "Copenhagen", ZonedDateTime.parse("2025-06-12T12:10+02:00"), ZonedDateTime.parse("2025-06-12T15:56+02:00"), 2075L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("2404.47"), 45),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("759.13"), 29),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("326.48"), 60))),
            new Flight(497, RED_LINE, "Amsterdam", "Brussels", ZonedDateTime.parse("2025-06-01T10:20+02:00"), ZonedDateTime.parse("2025-06-01T10:42+02:00"), 173L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("107.85"), 15),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("84.01"), 40),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("34.34"), 20))),
            new Flight(535, GREEN_FLIGHTS, "London", "Rome", ZonedDateTime.parse("2025-06-11T15:35+01:00"), ZonedDateTime.parse("2025-06-11T19:25+02:00"), 1437L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("522.01"), 67),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("320.11"), 1))),
            new Flight(141, RED_LINE, "Rome", "Stockholm", ZonedDateTime.parse("2025-06-10T13:55+02:00"), ZonedDateTime.parse("2025-06-10T17:25+02:00"), 1960L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1201.80"), 74),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("967.68"), 70),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("255.57"), 39))),
            new Flight(295, QUICK_AIR, "Rome", "Madrid", ZonedDateTime.parse("2025-06-14T17:10+02:00"), ZonedDateTime.parse("2025-06-14T20:01+02:00"), 1368L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("232.19"), 37))),
            new Flight(106, GREEN_FLIGHTS, "Madrid", "Rome", ZonedDateTime.parse("2025-06-06T16:50+02:00"), ZonedDateTime.parse("2025-06-06T19:20+02:00"), 1368L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("584.29"), 53),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("319.71"), 71))),
            new Flight(523, RED_LINE, "London", "Copenhagen", ZonedDateTime.parse("2025-06-14T18:35+01:00"), ZonedDateTime.parse("2025-06-14T21:44+02:00"), 958L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1049.78"), 23),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("435.93"), 39),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("105.78"), 18))),
            new Flight(902, BLUE_AIR, "London", "Amsterdam", ZonedDateTime.parse("2025-06-10T13:40+01:00"), ZonedDateTime.parse("2025-06-10T15:30+02:00"), 359L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("349.06"), 31),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("170.42"), 18),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("36.53"), 20))),
            new Flight(548, QUICK_AIR, "Madrid", "London", ZonedDateTime.parse("2025-06-02T15:10+02:00"), ZonedDateTime.parse("2025-06-02T16:39+01:00"), 1263L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("189.31"), 37))),
            new Flight(478, GREEN_FLIGHTS, "Amsterdam", "Stockholm", ZonedDateTime.parse("2025-06-14T13:25+02:00"), ZonedDateTime.parse("2025-06-14T15:56+02:00"), 1128L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("418.41"), 15),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("261.94"), 64))),
            new Flight(428, QUICK_AIR, "Rome", "Brussels", ZonedDateTime.parse("2025-06-08T09:45+02:00"), ZonedDateTime.parse("2025-06-08T12:25+02:00"), 1176L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("168.17"), 52))),
            new Flight(508, BLUE_AIR, "Copenhagen", "London", ZonedDateTime.parse("2025-06-06T19:55+02:00"), ZonedDateTime.parse("2025-06-06T20:57+01:00"), 958L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("943.22"), 28),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("415.87"), 69),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("129.19"), 13))),
            new Flight(122, GREEN_FLIGHTS, "London", "Rome", ZonedDateTime.parse("2025-06-04T08:40+01:00"), ZonedDateTime.parse("2025-06-04T12:05+02:00"), 1437L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("605.57"), 26),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("157.36"), 12))),
            new Flight(822, GREEN_FLIGHTS, "Rome", "London", ZonedDateTime.parse("2025-06-14T09:50+02:00"), ZonedDateTime.parse("2025-06-14T12:07+01:00"), 1437L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("713.71"), 60),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("307.39"), 37))),
            new Flight(592, RED_LINE, "Madrid", "Brussels", ZonedDateTime.parse("2025-06-07T08:20+02:00"), ZonedDateTime.parse("2025-06-07T10:45+02:00"), 1317L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1181.68"), 13),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("500.78"), 18),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("248.33"), 68))),
            new Flight(100, BLUE_AIR, "Amsterdam", "Copenhagen", ZonedDateTime.parse("2025-06-01T18:30+02:00"), ZonedDateTime.parse("2025-06-01T19:39+02:00"), 622L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("441.50"), 21),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("259.32"), 32),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("74.41"), 18))),
            new Flight(256, BLUE_AIR, "Brussels", "Madrid", ZonedDateTime.parse("2025-06-06T12:45+02:00"), ZonedDateTime.parse("2025-06-06T15:21+02:00"), 1317L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("907.85"), 11),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("591.47"), 43),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("196.86"), 37))),
            new Flight(691, GREEN_FLIGHTS, "Rome", "Madrid", ZonedDateTime.parse("2025-06-05T13:45+02:00"), ZonedDateTime.parse("2025-06-05T16:16+02:00"), 1368L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("587.95"), 14),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("306.55"), 13))),
            new Flight(318, GREEN_FLIGHTS, "Amsterdam", "Stockholm", ZonedDateTime.parse("2025-06-10T18:45+02:00"), ZonedDateTime.parse("2025-06-10T20:40+02:00"), 1128L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("486.61"), 67),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("217.82"), 17))),
            new Flight(504, QUICK_AIR, "Berlin", "Copenhagen", ZonedDateTime.parse("2025-06-06T14:00+02:00"), ZonedDateTime.parse("2025-06-06T14:36+02:00"), 356L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("42.87"), 58))),
            new Flight(870, BLUE_AIR, "Madrid", "Copenhagen", ZonedDateTime.parse("2025-06-02T08:20+02:00"), ZonedDateTime.parse("2025-06-02T12:10+02:00"), 2075L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1279.83"), 68),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("746.72"), 47),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("265.99"), 2))),
            new Flight(562, RED_LINE, "Brussels", "Amsterdam", ZonedDateTime.parse("2025-06-05T15:55+02:00"), ZonedDateTime.parse("2025-06-05T16:16+02:00"), 173L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("158.10"), 74),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("80.51"), 39),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("34.92"), 69))),
            new Flight(402, QUICK_AIR, "Paris", "Copenhagen", ZonedDateTime.parse("2025-06-10T10:35+02:00"), ZonedDateTime.parse("2025-06-10T12:22+02:00"), 1029L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("134.81"), 30))),
            new Flight(314, GREEN_FLIGHTS, "Brussels", "Copenhagen", ZonedDateTime.parse("2025-06-03T09:40+02:00"), ZonedDateTime.parse("2025-06-03T11:03+02:00"), 767L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("338.03"), 17),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("167.81"), 76))),
            new Flight(417, BLUE_AIR, "Madrid", "Rome", ZonedDateTime.parse("2025-06-08T11:50+02:00"), ZonedDateTime.parse("2025-06-08T14:09+02:00"), 1368L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("981.56"), 76),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("513.90"), 35),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("340.32"), 59))),
            new Flight(703, GREEN_FLIGHTS, "Copenhagen", "Rome", ZonedDateTime.parse("2025-06-09T12:05+02:00"), ZonedDateTime.parse("2025-06-09T15:11+02:00"), 1532L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("559.04"), 58),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("352.50"), 2))),
            new Flight(132, QUICK_AIR, "Paris", "Amsterdam", ZonedDateTime.parse("2025-06-13T17:50+02:00"), ZonedDateTime.parse("2025-06-13T18:46+02:00"), 430L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("81.18"), 23))),
            new Flight(139, BLUE_AIR, "Rome", "Brussels", ZonedDateTime.parse("2025-06-02T11:55+02:00"), ZonedDateTime.parse("2025-06-02T13:59+02:00"), 1176L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("736.58"), 0),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("500.01"), 51),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("159.31"), 8))),
            new Flight(304, GREEN_FLIGHTS, "Amsterdam", "Rome", ZonedDateTime.parse("2025-06-13T09:55+02:00"), ZonedDateTime.parse("2025-06-13T12:16+02:00"), 1297L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("455.95"), 57),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("163.41"), 25))),
            new Flight(593, QUICK_AIR, "Helsinki", "Berlin", ZonedDateTime.parse("2025-06-02T12:40+02:00"), ZonedDateTime.parse("2025-06-02T14:48+02:00"), 1108L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("236.56"), 12))),
            new Flight(736, RED_LINE, "Paris", "Helsinki", ZonedDateTime.parse("2025-06-03T08:55+02:00"), ZonedDateTime.parse("2025-06-03T12:14+02:00"), 1913L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("2190.29"), 24),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("871.65"), 15),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("400.93"), 68))),
            new Flight(455, GREEN_FLIGHTS, "Amsterdam", "Berlin", ZonedDateTime.parse("2025-06-03T18:05+02:00"), ZonedDateTime.parse("2025-06-03T19:26+02:00"), 578L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("254.02"), 74),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("93.57"), 30))),
            new Flight(571, QUICK_AIR, "Rome", "Stockholm", ZonedDateTime.parse("2025-06-08T18:55+02:00"), ZonedDateTime.parse("2025-06-08T23:15+02:00"), 1960L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("429.45"), 79))),
            new Flight(254, RED_LINE, "Stockholm", "Amsterdam", ZonedDateTime.parse("2025-06-07T10:55+02:00"), ZonedDateTime.parse("2025-06-07T13:00+02:00"), 1128L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("827.45"), 5),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("544.82"), 65),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("163.97"), 18))),
            new Flight(803, RED_LINE, "Brussels", "London", ZonedDateTime.parse("2025-06-09T15:05+02:00"), ZonedDateTime.parse("2025-06-09T14:39+01:00"), 322L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("302.02"), 55),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("143.62"), 58),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("61.77"), 20))),
            new Flight(728, QUICK_AIR, "Paris", "Stockholm", ZonedDateTime.parse("2025-06-13T11:20+02:00"), ZonedDateTime.parse("2025-06-13T14:32+02:00"), 1547L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("315.65"), 53))),
            new Flight(744, RED_LINE, "Rome", "London", ZonedDateTime.parse("2025-06-06T13:15+02:00"), ZonedDateTime.parse("2025-06-06T14:43+01:00"), 1437L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1284.99"), 74),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("694.50"), 55),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("234.04"), 76))),
            new Flight(699, GREEN_FLIGHTS, "Amsterdam", "Madrid", ZonedDateTime.parse("2025-06-14T08:25+02:00"), ZonedDateTime.parse("2025-06-14T11:39+02:00"), 1482L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("647.68"), 73),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("256.50"), 20))),
            new Flight(760, RED_LINE, "Brussels", "Copenhagen", ZonedDateTime.parse("2025-06-02T16:35+02:00"), ZonedDateTime.parse("2025-06-02T18:14+02:00"), 767L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("614.88"), 36),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("309.39"), 59),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("188.77"), 25))),
            new Flight(551, QUICK_AIR, "Madrid", "Stockholm", ZonedDateTime.parse("2025-06-10T12:55+02:00"), ZonedDateTime.parse("2025-06-10T18:50+02:00"), 2596L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("546.41"), 24))),
            new Flight(632, BLUE_AIR, "Berlin", "Helsinki", ZonedDateTime.parse("2025-06-08T14:05+02:00"), ZonedDateTime.parse("2025-06-08T16:11+02:00"), 1108L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("967.12"), 46),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("542.34"), 16),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("231.14"), 66))),
            new Flight(101, RED_LINE, "Berlin", "Paris", ZonedDateTime.parse("2025-06-01T08:55+02:00"), ZonedDateTime.parse("2025-06-01T10:55+02:00"), 880L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("885.63"), 6),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("401.07"), 28),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("99.57"), 75))),
            new Flight(206, RED_LINE, "Copenhagen", "Stockholm", ZonedDateTime.parse("2025-06-08T09:35+02:00"), ZonedDateTime.parse("2025-06-08T10:43+02:00"), 523L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("540.98"), 44),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("191.83"), 6),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("126.81"), 43))),
            new Flight(687, RED_LINE, "Berlin", "Rome", ZonedDateTime.parse("2025-06-06T14:10+02:00"), ZonedDateTime.parse("2025-06-06T16:46+02:00"), 1182L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("808.37"), 54),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("454.39"), 70),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("270.76"), 5))),
            new Flight(976, BLUE_AIR, "Brussels", "Amsterdam", ZonedDateTime.parse("2025-06-14T13:20+02:00"), ZonedDateTime.parse("2025-06-14T13:39+02:00"), 173L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("199.14"), 42),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("77.31"), 59),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("37.40"), 56))),
            new Flight(292, QUICK_AIR, "London", "Stockholm", ZonedDateTime.parse("2025-06-11T14:55+01:00"), ZonedDateTime.parse("2025-06-11T19:01+02:00"), 1461L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("295.58"), 41))),
            new Flight(788, RED_LINE, "Berlin", "Stockholm", ZonedDateTime.parse("2025-06-12T18:10+02:00"), ZonedDateTime.parse("2025-06-12T19:41+02:00"), 812L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("828.12"), 55),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("304.53"), 55),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("85.49"), 57))),
            new Flight(186, QUICK_AIR, "Copenhagen", "London", ZonedDateTime.parse("2025-06-07T13:45+02:00"), ZonedDateTime.parse("2025-06-07T14:29+01:00"), 958L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("203.29"), 34))),
            new Flight(459, QUICK_AIR, "Madrid", "London", ZonedDateTime.parse("2025-06-01T15:10+02:00"), ZonedDateTime.parse("2025-06-01T16:32+01:00"), 1263L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("285.92"), 13))),
            new Flight(345, GREEN_FLIGHTS, "Paris", "Copenhagen", ZonedDateTime.parse("2025-06-10T14:20+02:00"), ZonedDateTime.parse("2025-06-10T16:16+02:00"), 1029L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("384.84"), 6),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("192.40"), 20))),
            new Flight(511, GREEN_FLIGHTS, "Berlin", "Paris", ZonedDateTime.parse("2025-06-11T14:00+02:00"), ZonedDateTime.parse("2025-06-11T15:44+02:00"), 880L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("401.86"), 6),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("97.41"), 27))),
            new Flight(468, QUICK_AIR, "Brussels", "Helsinki", ZonedDateTime.parse("2025-06-11T19:10+02:00"), ZonedDateTime.parse("2025-06-11T22:16+02:00"), 1710L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("307.90"), 66))),
            new Flight(246, BLUE_AIR, "London", "Paris", ZonedDateTime.parse("2025-06-03T17:00+01:00"), ZonedDateTime.parse("2025-06-03T18:36+02:00"), 344L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("356.54"), 7),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("153.72"), 28),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("51.48"), 39))),
            new Flight(168, QUICK_AIR, "Copenhagen", "London", ZonedDateTime.parse("2025-06-14T18:00+02:00"), ZonedDateTime.parse("2025-06-14T18:43+01:00"), 958L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("199.64"), 36))),
            new Flight(575, RED_LINE, "Amsterdam", "Paris", ZonedDateTime.parse("2025-06-12T10:25+02:00"), ZonedDateTime.parse("2025-06-12T11:12+02:00"), 430L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("328.32"), 34),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("185.55"), 43),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("54.73"), 69))),
            new Flight(127, QUICK_AIR, "Helsinki", "Amsterdam", ZonedDateTime.parse("2025-06-02T13:15+02:00"), ZonedDateTime.parse("2025-06-02T15:48+02:00"), 1505L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("356.63"), 68))),
            new Flight(804, GREEN_FLIGHTS, "London", "Copenhagen", ZonedDateTime.parse("2025-06-04T17:10+01:00"), ZonedDateTime.parse("2025-06-04T20:13+02:00"), 958L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("441.41"), 53),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("197.55"), 9))),
            new Flight(833, GREEN_FLIGHTS, "Rome", "Madrid", ZonedDateTime.parse("2025-06-11T17:40+02:00"), ZonedDateTime.parse("2025-06-11T20:15+02:00"), 1368L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("593.87"), 38),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("190.71"), 70))),
            new Flight(674, BLUE_AIR, "Amsterdam", "London", ZonedDateTime.parse("2025-06-05T16:20+02:00"), ZonedDateTime.parse("2025-06-05T15:57+01:00"), 359L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("236.95"), 60),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("169.02"), 61),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("42.04"), 13))),
            new Flight(240, GREEN_FLIGHTS, "Stockholm", "Amsterdam", ZonedDateTime.parse("2025-06-14T18:20+02:00"), ZonedDateTime.parse("2025-06-14T20:57+02:00"), 1128L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("546.80"), 35),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("170.67"), 15))),
            new Flight(666, GREEN_FLIGHTS, "Madrid", "London", ZonedDateTime.parse("2025-06-09T10:05+02:00"), ZonedDateTime.parse("2025-06-09T11:51+01:00"), 1263L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("477.53"), 3),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("309.19"), 31))),
            new Flight(480, GREEN_FLIGHTS, "Madrid", "London", ZonedDateTime.parse("2025-06-13T14:10+02:00"), ZonedDateTime.parse("2025-06-13T15:26+01:00"), 1263L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("477.56"), 75),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("183.83"), 4))),
            new Flight(380, QUICK_AIR, "Copenhagen", "Rome", ZonedDateTime.parse("2025-06-04T08:45+02:00"), ZonedDateTime.parse("2025-06-04T12:08+02:00"), 1532L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("280.89"), 52))),
            new Flight(331, BLUE_AIR, "London", "Madrid", ZonedDateTime.parse("2025-06-14T18:50+01:00"), ZonedDateTime.parse("2025-06-14T22:26+02:00"), 1263L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("858.69"), 32),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("512.42"), 48),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("157.66"), 48))),
            new Flight(743, GREEN_FLIGHTS, "Rome", "Copenhagen", ZonedDateTime.parse("2025-06-07T16:45+02:00"), ZonedDateTime.parse("2025-06-07T19:50+02:00"), 1532L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("703.22"), 59),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("228.72"), 66))),
            new Flight(927, QUICK_AIR, "Rome", "Brussels", ZonedDateTime.parse("2025-06-08T15:00+02:00"), ZonedDateTime.parse("2025-06-08T17:46+02:00"), 1176L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("223.00"), 37))),
            new Flight(313, BLUE_AIR, "Helsinki", "Stockholm", ZonedDateTime.parse("2025-06-09T14:15+02:00"), ZonedDateTime.parse("2025-06-09T15:00+02:00"), 396L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("397.99"), 22),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("180.43"), 28),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("66.12"), 69))),
            new Flight(583, GREEN_FLIGHTS, "Berlin", "Helsinki", ZonedDateTime.parse("2025-06-14T11:30+02:00"), ZonedDateTime.parse("2025-06-14T13:46+02:00"), 1108L, List.of(
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("530.84"), 12),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("173.72"), 4))),
            new Flight(356, QUICK_AIR, "London", "Stockholm", ZonedDateTime.parse("2025-06-04T13:05+01:00"), ZonedDateTime.parse("2025-06-04T16:34+02:00"), 1461L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("315.36"), 60))),
            new Flight(265, QUICK_AIR, "Paris", "Brussels", ZonedDateTime.parse("2025-06-12T15:55+02:00"), ZonedDateTime.parse("2025-06-12T16:22+02:00"), 264L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("38.04"), 75))),
            new Flight(723, BLUE_AIR, "Stockholm", "Helsinki", ZonedDateTime.parse("2025-06-11T10:00+02:00"), ZonedDateTime.parse("2025-06-11T10:40+02:00"), 396L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("352.67"), 34),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("152.85"), 10),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("69.49"), 36))),
            new Flight(147, QUICK_AIR, "Amsterdam", "London", ZonedDateTime.parse("2025-06-02T18:05+02:00"), ZonedDateTime.parse("2025-06-02T17:43+01:00"), 359L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("42.98"), 17))),
            new Flight(887, BLUE_AIR, "Amsterdam", "Brussels", ZonedDateTime.parse("2025-06-02T15:20+02:00"), ZonedDateTime.parse("2025-06-02T15:44+02:00"), 173L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("142.62"), 15),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("62.21"), 68),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("24.54"), 9))),
            new Flight(482, RED_LINE, "Amsterdam", "Berlin", ZonedDateTime.parse("2025-06-03T08:40+02:00"), ZonedDateTime.parse("2025-06-03T09:42+02:00"), 578L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("423.34"), 46),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("233.11"), 9),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("92.00"), 11))),
            new Flight(900, BLUE_AIR, "Copenhagen", "London", ZonedDateTime.parse("2025-06-07T13:50+02:00"), ZonedDateTime.parse("2025-06-07T14:28+01:00"), 958L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("836.11"), 12),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("396.79"), 20),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("166.11"), 57))),
            new Flight(989, QUICK_AIR, "Paris", "Amsterdam", ZonedDateTime.parse("2025-06-13T17:20+02:00"), ZonedDateTime.parse("2025-06-13T18:20+02:00"), 430L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("59.53"), 48))),
            new Flight(315, BLUE_AIR, "Madrid", "Brussels", ZonedDateTime.parse("2025-06-14T09:15+02:00"), ZonedDateTime.parse("2025-06-14T12:19+02:00"), 1317L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1014.23"), 14),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("598.10"), 13),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("214.53"), 33))),
            new Flight(559, BLUE_AIR, "Helsinki", "Madrid", ZonedDateTime.parse("2025-06-04T19:35+02:00"), ZonedDateTime.parse("2025-06-05T02:20+02:00"), 2953L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("2250.14"), 45),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("1051.41"), 63),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("518.06"), 67))),
            new Flight(531, QUICK_AIR, "Rome", "Amsterdam", ZonedDateTime.parse("2025-06-04T11:35+02:00"), ZonedDateTime.parse("2025-06-04T14:37+02:00"), 1297L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("316.82"), 7))),
            new Flight(362, RED_LINE, "Madrid", "Copenhagen", ZonedDateTime.parse("2025-06-03T14:05+02:00"), ZonedDateTime.parse("2025-06-03T18:50+02:00"), 2075L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("2142.11"), 64),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("787.92"), 58),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("309.41"), 54))),
            new Flight(906, QUICK_AIR, "Paris", "London", ZonedDateTime.parse("2025-06-03T08:15+02:00"), ZonedDateTime.parse("2025-06-03T08:00+01:00"), 344L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("72.40"), 30))),
            new Flight(401, RED_LINE, "Stockholm", "Helsinki", ZonedDateTime.parse("2025-06-06T08:45+02:00"), ZonedDateTime.parse("2025-06-06T09:30+02:00"), 396L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("294.45"), 12),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("173.56"), 73),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("65.87"), 38))),
            new Flight(646, QUICK_AIR, "Berlin", "London", ZonedDateTime.parse("2025-06-07T09:25+02:00"), ZonedDateTime.parse("2025-06-07T10:04+01:00"), 935L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("213.62"), 72))),
            new Flight(442, RED_LINE, "Brussels", "Copenhagen", ZonedDateTime.parse("2025-06-06T19:50+02:00"), ZonedDateTime.parse("2025-06-06T21:23+02:00"), 767L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("900.80"), 45),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("324.12"), 76),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("134.22"), 37))),
            new Flight(901, QUICK_AIR, "Berlin", "Amsterdam", ZonedDateTime.parse("2025-06-12T14:55+02:00"), ZonedDateTime.parse("2025-06-12T16:04+02:00"), 578L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("95.43"), 67))),
            new Flight(978, QUICK_AIR, "Madrid", "Paris", ZonedDateTime.parse("2025-06-02T11:30+02:00"), ZonedDateTime.parse("2025-06-02T13:32+02:00"), 1053L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("240.08"), 35))),
            new Flight(287, QUICK_AIR, "Berlin", "Helsinki", ZonedDateTime.parse("2025-06-08T11:15+02:00"), ZonedDateTime.parse("2025-06-08T13:11+02:00"), 1108L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("127.33"), 26))),
            new Flight(116, QUICK_AIR, "Madrid", "Stockholm", ZonedDateTime.parse("2025-06-13T12:00+02:00"), ZonedDateTime.parse("2025-06-13T17:06+02:00"), 2596L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("312.69"), 6))),
            new Flight(866, RED_LINE, "London", "Stockholm", ZonedDateTime.parse("2025-06-01T09:50+01:00"), ZonedDateTime.parse("2025-06-01T13:51+02:00"), 1461L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1744.87"), 57),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("678.12"), 56),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("152.52"), 20))),
            new Flight(169, RED_LINE, "Rome", "London", ZonedDateTime.parse("2025-06-11T11:50+02:00"), ZonedDateTime.parse("2025-06-11T13:18+01:00"), 1437L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1009.10"), 11),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("639.03"), 39),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("313.22"), 74))),
            new Flight(210, BLUE_AIR, "Amsterdam", "Rome", ZonedDateTime.parse("2025-06-13T08:10+02:00"), ZonedDateTime.parse("2025-06-13T10:31+02:00"), 1297L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1529.08"), 47),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("610.33"), 3),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("158.49"), 62))),
            new Flight(702, RED_LINE, "Amsterdam", "Stockholm", ZonedDateTime.parse("2025-06-12T17:25+02:00"), ZonedDateTime.parse("2025-06-12T20:00+02:00"), 1128L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("901.13"), 30),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("519.18"), 33),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("235.40"), 66))),
            new Flight(303, BLUE_AIR, "Helsinki", "Madrid", ZonedDateTime.parse("2025-06-09T09:45+02:00"), ZonedDateTime.parse("2025-06-09T16:05+02:00"), 2953L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("3036.90"), 30),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("1080.26"), 79),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("662.24"), 77))),
            new Flight(629, QUICK_AIR, "Helsinki", "Rome", ZonedDateTime.parse("2025-06-02T12:45+02:00"), ZonedDateTime.parse("2025-06-02T16:55+02:00"), 2144L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("355.00"), 64))),
            new Flight(517, RED_LINE, "Berlin", "Copenhagen", ZonedDateTime.parse("2025-06-02T18:45+02:00"), ZonedDateTime.parse("2025-06-02T19:24+02:00"), 356L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("356.55"), 44),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("176.47"), 38),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("50.23"), 26))),
            new Flight(252, QUICK_AIR, "Helsinki", "Madrid", ZonedDateTime.parse("2025-06-12T15:35+02:00"), ZonedDateTime.parse("2025-06-12T20:32+02:00"), 2953L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("610.78"), 53))),
            new Flight(609, BLUE_AIR, "Madrid", "Copenhagen", ZonedDateTime.parse("2025-06-12T17:40+02:00"), ZonedDateTime.parse("2025-06-12T21:21+02:00"), 2075L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("1304.93"), 74),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("945.05"), 54),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("363.92"), 25))),
            new Flight(926, BLUE_AIR, "Brussels", "London", ZonedDateTime.parse("2025-06-06T18:45+02:00"), ZonedDateTime.parse("2025-06-06T18:22+01:00"), 322L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("209.41"), 72),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("114.80"), 59),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("64.11"), 73))),
            new Flight(603, QUICK_AIR, "Brussels", "Rome", ZonedDateTime.parse("2025-06-05T12:40+02:00"), ZonedDateTime.parse("2025-06-05T14:53+02:00"), 1176L, List.of(
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("117.91"), 47))),
            new Flight(769, BLUE_AIR, "Helsinki", "Stockholm", ZonedDateTime.parse("2025-06-01T14:00+02:00"), ZonedDateTime.parse("2025-06-01T14:48+02:00"), 396L, List.of(
                    new Fare(ComfortLevel.FIRST, new BigDecimal("460.42"), 70),
                    new Fare(ComfortLevel.BUSINESS, new BigDecimal("167.20"), 68),
                    new Fare(ComfortLevel.ECONOMY, new BigDecimal("92.09"), 38))));
}
