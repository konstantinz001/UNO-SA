var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "470",
        "ko": "1530"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "1428"
    },
    "maxResponseTime": {
        "total": "19758",
        "ok": "19758",
        "ko": "19667"
    },
    "meanResponseTime": {
        "total": "3018",
        "ok": "2658",
        "ko": "3129"
    },
    "standardDeviation": {
        "total": "4001",
        "ok": "5255",
        "ko": "3520"
    },
    "percentiles1": {
        "total": "2296",
        "ok": "444",
        "ko": "2312"
    },
    "percentiles2": {
        "total": "2467",
        "ok": "3052",
        "ko": "2447"
    },
    "percentiles3": {
        "total": "19281",
        "ok": "19564",
        "ko": "4377"
    },
    "percentiles4": {
        "total": "19630",
        "ok": "19733",
        "ko": "19598"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 257,
    "percentage": 13
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 23,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 190,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 1530,
    "percentage": 77
},
    "meanNumberOfRequestsPerSecond": {
        "total": "86.957",
        "ok": "20.435",
        "ko": "66.522"
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
        "ok": "39",
        "ko": "961"
    },
    "minResponseTime": {
        "total": "1428",
        "ok": "19506",
        "ko": "1428"
    },
    "maxResponseTime": {
        "total": "19758",
        "ok": "19758",
        "ko": "19667"
    },
    "meanResponseTime": {
        "total": "4294",
        "ok": "19606",
        "ko": "3672"
    },
    "standardDeviation": {
        "total": "5263",
        "ok": "81",
        "ko": "4350"
    },
    "percentiles1": {
        "total": "2400",
        "ok": "19610",
        "ko": "2391"
    },
    "percentiles2": {
        "total": "2603",
        "ok": "19639",
        "ko": "2567"
    },
    "percentiles3": {
        "total": "19561",
        "ok": "19746",
        "ko": "19392"
    },
    "percentiles4": {
        "total": "19645",
        "ok": "19755",
        "ko": "19627"
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
    "count": 39,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "count": 961,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "43.478",
        "ok": "1.696",
        "ko": "41.783"
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
        "ok": "431",
        "ko": "569"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "2008"
    },
    "maxResponseTime": {
        "total": "3396",
        "ok": "3396",
        "ko": "2439"
    },
    "meanResponseTime": {
        "total": "1742",
        "ok": "1124",
        "ko": "2211"
    },
    "standardDeviation": {
        "total": "1029",
        "ok": "1331",
        "ko": "107"
    },
    "percentiles1": {
        "total": "2168",
        "ok": "329",
        "ko": "2204"
    },
    "percentiles2": {
        "total": "2308",
        "ok": "2790",
        "ko": "2300"
    },
    "percentiles3": {
        "total": "3207",
        "ok": "3322",
        "ko": "2378"
    },
    "percentiles4": {
        "total": "3358",
        "ok": "3384",
        "ko": "2434"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 257,
    "percentage": 26
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 23,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 151,
    "percentage": 15
},
    "group4": {
    "name": "failed",
    "count": 569,
    "percentage": 57
},
    "meanNumberOfRequestsPerSecond": {
        "total": "43.478",
        "ok": "18.739",
        "ko": "24.739"
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
