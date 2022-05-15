var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1000",
        "ok": "652",
        "ko": "348"
    },
    "minResponseTime": {
        "total": "4",
        "ok": "4",
        "ko": "2017"
    },
    "maxResponseTime": {
        "total": "4010",
        "ok": "4010",
        "ko": "2218"
    },
    "meanResponseTime": {
        "total": "1549",
        "ok": "1240",
        "ko": "2127"
    },
    "standardDeviation": {
        "total": "949",
        "ok": "1052",
        "ko": "47"
    },
    "percentiles1": {
        "total": "1715",
        "ok": "1067",
        "ko": "2133"
    },
    "percentiles2": {
        "total": "2147",
        "ok": "1683",
        "ko": "2166"
    },
    "percentiles3": {
        "total": "3237",
        "ok": "3452",
        "ko": "2191"
    },
    "percentiles4": {
        "total": "3881",
        "ok": "3927",
        "ko": "2207"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 277,
    "percentage": 28
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 83,
    "percentage": 8
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 292,
    "percentage": 29
},
    "group4": {
    "name": "failed",
    "count": 348,
    "percentage": 35
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125",
        "ok": "81.5",
        "ko": "43.5"
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
        "total": "500",
        "ok": "152",
        "ko": "348"
    },
    "minResponseTime": {
        "total": "1504",
        "ok": "1504",
        "ko": "2017"
    },
    "maxResponseTime": {
        "total": "4010",
        "ok": "4010",
        "ko": "2218"
    },
    "meanResponseTime": {
        "total": "2326",
        "ok": "2782",
        "ko": "2127"
    },
    "standardDeviation": {
        "total": "518",
        "ok": "761",
        "ko": "47"
    },
    "percentiles1": {
        "total": "2148",
        "ok": "2858",
        "ko": "2133"
    },
    "percentiles2": {
        "total": "2195",
        "ok": "3383",
        "ko": "2166"
    },
    "percentiles3": {
        "total": "3596",
        "ok": "3921",
        "ko": "2191"
    },
    "percentiles4": {
        "total": "3934",
        "ok": "3993",
        "ko": "2207"
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
    "count": 152,
    "percentage": 30
},
    "group4": {
    "name": "failed",
    "count": 348,
    "percentage": 70
},
    "meanNumberOfRequestsPerSecond": {
        "total": "62.5",
        "ok": "19",
        "ko": "43.5"
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
        "total": "500",
        "ok": "500",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1760",
        "ok": "1760",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "771",
        "ok": "771",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "570",
        "ok": "570",
        "ko": "-"
    },
    "percentiles1": {
        "total": "718",
        "ok": "718",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1252",
        "ok": "1252",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1698",
        "ok": "1698",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1746",
        "ok": "1746",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 277,
    "percentage": 55
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 83,
    "percentage": 17
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 140,
    "percentage": 28
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "62.5",
        "ok": "62.5",
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
