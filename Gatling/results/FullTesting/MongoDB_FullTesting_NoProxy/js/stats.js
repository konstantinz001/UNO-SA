var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "6349",
        "ko": "4321"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "16867",
        "ok": "16867",
        "ko": "16468"
    },
    "meanResponseTime": {
        "total": "1240",
        "ok": "689",
        "ko": "2050"
    },
    "standardDeviation": {
        "total": "2045",
        "ok": "1875",
        "ko": "2014"
    },
    "percentiles1": {
        "total": "54",
        "ok": "14",
        "ko": "2046"
    },
    "percentiles2": {
        "total": "2054",
        "ok": "81",
        "ko": "2146"
    },
    "percentiles3": {
        "total": "4595",
        "ok": "4733",
        "ko": "4165"
    },
    "percentiles4": {
        "total": "9958",
        "ok": "8904",
        "ko": "12353"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5274,
    "percentage": 49
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 277,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 798,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 4321,
    "percentage": 40
},
    "meanNumberOfRequestsPerSecond": {
        "total": "37.972",
        "ok": "22.594",
        "ko": "15.377"
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
        "total": "5335",
        "ok": "1737",
        "ko": "3598"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "16867",
        "ok": "16867",
        "ko": "16468"
    },
    "meanResponseTime": {
        "total": "1928",
        "ok": "1672",
        "ko": "2051"
    },
    "standardDeviation": {
        "total": "2496",
        "ok": "2991",
        "ko": "2207"
    },
    "percentiles1": {
        "total": "2027",
        "ok": "16",
        "ko": "2052"
    },
    "percentiles2": {
        "total": "2202",
        "ok": "2617",
        "ko": "2197"
    },
    "percentiles3": {
        "total": "7803",
        "ok": "8397",
        "ko": "5522"
    },
    "percentiles4": {
        "total": "12542",
        "ok": "10728",
        "ko": "13069"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1200,
    "percentage": 22
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 32,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 505,
    "percentage": 9
},
    "group4": {
    "name": "failed",
    "count": 3598,
    "percentage": 67
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.986",
        "ok": "6.181",
        "ko": "12.804"
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
        "total": "5335",
        "ok": "4612",
        "ko": "723"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2010"
    },
    "maxResponseTime": {
        "total": "9975",
        "ok": "9975",
        "ko": "2123"
    },
    "meanResponseTime": {
        "total": "553",
        "ok": "319",
        "ko": "2044"
    },
    "standardDeviation": {
        "total": "1089",
        "ok": "985",
        "ko": "19"
    },
    "percentiles1": {
        "total": "3",
        "ok": "2",
        "ko": "2042"
    },
    "percentiles2": {
        "total": "571",
        "ok": "51",
        "ko": "2053"
    },
    "percentiles3": {
        "total": "2101",
        "ok": "2347",
        "ko": "2073"
    },
    "percentiles4": {
        "total": "5070",
        "ok": "5505",
        "ko": "2113"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4074,
    "percentage": 76
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 245,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 293,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 723,
    "percentage": 14
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.986",
        "ok": "16.413",
        "ko": "2.573"
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
