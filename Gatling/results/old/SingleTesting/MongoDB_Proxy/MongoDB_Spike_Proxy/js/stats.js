var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "701",
        "ko": "1299"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "326"
    },
    "maxResponseTime": {
        "total": "11152",
        "ok": "11152",
        "ko": "10090"
    },
    "meanResponseTime": {
        "total": "1852",
        "ok": "1539",
        "ko": "2021"
    },
    "standardDeviation": {
        "total": "1314",
        "ok": "1944",
        "ko": "732"
    },
    "percentiles1": {
        "total": "2063",
        "ok": "756",
        "ko": "2086"
    },
    "percentiles2": {
        "total": "2240",
        "ok": "3885",
        "ko": "2228"
    },
    "percentiles3": {
        "total": "3949",
        "ok": "3984",
        "ko": "3082"
    },
    "percentiles4": {
        "total": "5944",
        "ok": "8952",
        "ko": "3923"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 397,
    "percentage": 20
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 86,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 218,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 1299,
    "percentage": 65
},
    "meanNumberOfRequestsPerSecond": {
        "total": "133.333",
        "ok": "46.733",
        "ko": "86.6"
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
        "total": "1000",
        "ok": "22",
        "ko": "978"
    },
    "minResponseTime": {
        "total": "326",
        "ok": "4937",
        "ko": "326"
    },
    "maxResponseTime": {
        "total": "11152",
        "ok": "11152",
        "ko": "10090"
    },
    "meanResponseTime": {
        "total": "2131",
        "ok": "7588",
        "ko": "2009"
    },
    "standardDeviation": {
        "total": "1199",
        "ok": "1829",
        "ko": "843"
    },
    "percentiles1": {
        "total": "2153",
        "ok": "7981",
        "ko": "2147"
    },
    "percentiles2": {
        "total": "2257",
        "ok": "9052",
        "ko": "2251"
    },
    "percentiles3": {
        "total": "3165",
        "ok": "10190",
        "ko": "3114"
    },
    "percentiles4": {
        "total": "8214",
        "ok": "10951",
        "ko": "3976"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 22,
    "percentage": 2
},
    "group4": {
    "name": "failed",
    "count": 978,
    "percentage": 98
},
    "meanNumberOfRequestsPerSecond": {
        "total": "66.667",
        "ok": "1.467",
        "ko": "65.2"
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
        "total": "1000",
        "ok": "679",
        "ko": "321"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2028"
    },
    "maxResponseTime": {
        "total": "4004",
        "ok": "4004",
        "ko": "2110"
    },
    "meanResponseTime": {
        "total": "1573",
        "ok": "1343",
        "ko": "2060"
    },
    "standardDeviation": {
        "total": "1363",
        "ok": "1603",
        "ko": "16"
    },
    "percentiles1": {
        "total": "2037",
        "ok": "748",
        "ko": "2057"
    },
    "percentiles2": {
        "total": "2075",
        "ok": "2900",
        "ko": "2072"
    },
    "percentiles3": {
        "total": "3957",
        "ok": "3967",
        "ko": "2089"
    },
    "percentiles4": {
        "total": "3987",
        "ok": "3993",
        "ko": "2094"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 397,
    "percentage": 40
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 86,
    "percentage": 9
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 196,
    "percentage": 20
},
    "group4": {
    "name": "failed",
    "count": 321,
    "percentage": 32
},
    "meanNumberOfRequestsPerSecond": {
        "total": "66.667",
        "ok": "45.267",
        "ko": "21.4"
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
