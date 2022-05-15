var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "6173",
        "ko": "4497"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "31931",
        "ok": "31931",
        "ko": "31227"
    },
    "meanResponseTime": {
        "total": "1671",
        "ok": "1239",
        "ko": "2263"
    },
    "standardDeviation": {
        "total": "3377",
        "ok": "3305",
        "ko": "3385"
    },
    "percentiles1": {
        "total": "854",
        "ok": "14",
        "ko": "2042"
    },
    "percentiles2": {
        "total": "2055",
        "ok": "960",
        "ko": "2133"
    },
    "percentiles3": {
        "total": "5971",
        "ok": "6475",
        "ko": "3818"
    },
    "percentiles4": {
        "total": "23132",
        "ok": "17001",
        "ko": "26273"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4402,
    "percentage": 41
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 541,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1230,
    "percentage": 12
},
    "group4": {
    "name": "failed",
    "count": 4497,
    "percentage": 42
},
    "meanNumberOfRequestsPerSecond": {
        "total": "36.416",
        "ok": "21.068",
        "ko": "15.348"
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
        "ok": "1948",
        "ko": "3387"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "31931",
        "ok": "31931",
        "ko": "31227"
    },
    "meanResponseTime": {
        "total": "2352",
        "ok": "2379",
        "ko": "2337"
    },
    "standardDeviation": {
        "total": "4236",
        "ok": "4766",
        "ko": "3898"
    },
    "percentiles1": {
        "total": "2032",
        "ok": "129",
        "ko": "2047"
    },
    "percentiles2": {
        "total": "2249",
        "ok": "3028",
        "ko": "2205"
    },
    "percentiles3": {
        "total": "7076",
        "ok": "8528",
        "ko": "5794"
    },
    "percentiles4": {
        "total": "27418",
        "ok": "27582",
        "ko": "27363"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1130,
    "percentage": 21
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 121,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 697,
    "percentage": 13
},
    "group4": {
    "name": "failed",
    "count": 3387,
    "percentage": 63
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.208",
        "ok": "6.648",
        "ko": "11.56"
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
        "ok": "4225",
        "ko": "1110"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2002"
    },
    "maxResponseTime": {
        "total": "24938",
        "ok": "24938",
        "ko": "2149"
    },
    "meanResponseTime": {
        "total": "990",
        "ok": "714",
        "ko": "2039"
    },
    "standardDeviation": {
        "total": "1986",
        "ok": "2148",
        "ko": "17"
    },
    "percentiles1": {
        "total": "11",
        "ok": "3",
        "ko": "2036"
    },
    "percentiles2": {
        "total": "2019",
        "ok": "725",
        "ko": "2050"
    },
    "percentiles3": {
        "total": "2238",
        "ok": "3171",
        "ko": "2067"
    },
    "percentiles4": {
        "total": "13031",
        "ok": "13036",
        "ko": "2092"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 3272,
    "percentage": 61
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 420,
    "percentage": 8
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 533,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 1110,
    "percentage": 21
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.208",
        "ok": "14.42",
        "ko": "3.788"
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
