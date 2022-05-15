var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "1912",
        "ko": "1148"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "14"
    },
    "maxResponseTime": {
        "total": "11321",
        "ok": "11321",
        "ko": "10023"
    },
    "meanResponseTime": {
        "total": "1919",
        "ok": "1552",
        "ko": "2531"
    },
    "standardDeviation": {
        "total": "2277",
        "ok": "2539",
        "ko": "1577"
    },
    "percentiles1": {
        "total": "2016",
        "ok": "17",
        "ko": "2033"
    },
    "percentiles2": {
        "total": "2062",
        "ok": "2837",
        "ko": "2048"
    },
    "percentiles3": {
        "total": "6775",
        "ok": "6852",
        "ko": "6462"
    },
    "percentiles4": {
        "total": "7910",
        "ok": "8277",
        "ko": "7870"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1302,
    "percentage": 43
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 69,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 541,
    "percentage": 18
},
    "group4": {
    "name": "failed",
    "count": 1148,
    "percentage": 38
},
    "meanNumberOfRequestsPerSecond": {
        "total": "41.351",
        "ok": "25.838",
        "ko": "15.514"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "1530",
        "ok": "741",
        "ko": "789"
    },
    "minResponseTime": {
        "total": "13",
        "ok": "13",
        "ko": "14"
    },
    "maxResponseTime": {
        "total": "11321",
        "ok": "11321",
        "ko": "10023"
    },
    "meanResponseTime": {
        "total": "2833",
        "ok": "2913",
        "ko": "2758"
    },
    "standardDeviation": {
        "total": "2490",
        "ok": "3017",
        "ko": "1859"
    },
    "percentiles1": {
        "total": "2033",
        "ok": "1924",
        "ko": "2033"
    },
    "percentiles2": {
        "total": "5091",
        "ok": "5961",
        "ko": "2557"
    },
    "percentiles3": {
        "total": "7376",
        "ok": "7461",
        "ko": "6912"
    },
    "percentiles4": {
        "total": "8355",
        "ok": "8813",
        "ko": "7885"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 338,
    "percentage": 22
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 14,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 389,
    "percentage": 25
},
    "group4": {
    "name": "failed",
    "count": 789,
    "percentage": 52
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.676",
        "ok": "10.014",
        "ko": "10.662"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "1530",
        "ok": "1171",
        "ko": "359"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "7797",
        "ok": "7797",
        "ko": "2093"
    },
    "meanResponseTime": {
        "total": "1006",
        "ok": "691",
        "ko": "2033"
    },
    "standardDeviation": {
        "total": "1582",
        "ok": "1688",
        "ko": "14"
    },
    "percentiles1": {
        "total": "10",
        "ok": "5",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "2032",
        "ok": "16",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "4926",
        "ok": "5276",
        "ko": "2062"
    },
    "percentiles4": {
        "total": "6280",
        "ok": "6506",
        "ko": "2064"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 964,
    "percentage": 63
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 55,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 152,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 359,
    "percentage": 23
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.676",
        "ok": "15.824",
        "ko": "4.851"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
