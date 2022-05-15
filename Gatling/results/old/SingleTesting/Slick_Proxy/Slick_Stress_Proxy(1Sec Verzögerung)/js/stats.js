var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "2043",
        "ko": "1017"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "29"
    },
    "maxResponseTime": {
        "total": "12092",
        "ok": "12092",
        "ko": "11464"
    },
    "meanResponseTime": {
        "total": "941",
        "ok": "427",
        "ko": "1975"
    },
    "standardDeviation": {
        "total": "2497",
        "ok": "1460",
        "ko": "3588"
    },
    "percentiles1": {
        "total": "34",
        "ok": "6",
        "ko": "42"
    },
    "percentiles2": {
        "total": "65",
        "ok": "42",
        "ko": "1636"
    },
    "percentiles3": {
        "total": "9053",
        "ok": "3667",
        "ko": "10369"
    },
    "percentiles4": {
        "total": "11040",
        "ok": "8904",
        "ko": "11107"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1855,
    "percentage": 61
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 20,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 168,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 1017,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "43.714",
        "ok": "29.186",
        "ko": "14.529"
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
        "ok": "513",
        "ko": "1017"
    },
    "minResponseTime": {
        "total": "28",
        "ok": "28",
        "ko": "29"
    },
    "maxResponseTime": {
        "total": "12092",
        "ok": "12092",
        "ko": "11464"
    },
    "meanResponseTime": {
        "total": "1863",
        "ok": "1641",
        "ko": "1975"
    },
    "standardDeviation": {
        "total": "3281",
        "ok": "2552",
        "ko": "3588"
    },
    "percentiles1": {
        "total": "46",
        "ok": "94",
        "ko": "42"
    },
    "percentiles2": {
        "total": "2540",
        "ok": "3453",
        "ko": "1636"
    },
    "percentiles3": {
        "total": "10289",
        "ok": "4918",
        "ko": "10369"
    },
    "percentiles4": {
        "total": "11233",
        "ok": "11279",
        "ko": "11107"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 325,
    "percentage": 21
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 20,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 168,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 1017,
    "percentage": 66
},
    "meanNumberOfRequestsPerSecond": {
        "total": "21.857",
        "ok": "7.329",
        "ko": "14.529"
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
        "ok": "1530",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "442",
        "ok": "442",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "20",
        "ok": "20",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "46",
        "ok": "46",
        "ko": "-"
    },
    "percentiles1": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles2": {
        "total": "9",
        "ok": "9",
        "ko": "-"
    },
    "percentiles3": {
        "total": "119",
        "ok": "119",
        "ko": "-"
    },
    "percentiles4": {
        "total": "198",
        "ok": "198",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1530,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "21.857",
        "ok": "21.857",
        "ko": "-"
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
