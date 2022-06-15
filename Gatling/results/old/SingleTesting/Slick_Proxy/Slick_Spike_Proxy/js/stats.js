var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "1317",
        "ko": "683"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2036"
    },
    "maxResponseTime": {
        "total": "7316",
        "ok": "5170",
        "ko": "7316"
    },
    "meanResponseTime": {
        "total": "1365",
        "ok": "812",
        "ko": "2431"
    },
    "standardDeviation": {
        "total": "1069",
        "ok": "860",
        "ko": "440"
    },
    "percentiles1": {
        "total": "1202",
        "ok": "674",
        "ko": "2368"
    },
    "percentiles2": {
        "total": "2340",
        "ok": "1194",
        "ko": "2540"
    },
    "percentiles3": {
        "total": "2785",
        "ok": "2742",
        "ko": "2830"
    },
    "percentiles4": {
        "total": "3417",
        "ok": "3331",
        "ko": "3914"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 799,
    "percentage": 40
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 198,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 320,
    "percentage": 16
},
    "group4": {
    "name": "failed",
    "count": 683,
    "percentage": 34
},
    "meanNumberOfRequestsPerSecond": {
        "total": "166.667",
        "ok": "109.75",
        "ko": "56.917"
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
        "ok": "317",
        "ko": "683"
    },
    "minResponseTime": {
        "total": "293",
        "ok": "293",
        "ko": "2036"
    },
    "maxResponseTime": {
        "total": "7316",
        "ok": "5170",
        "ko": "7316"
    },
    "meanResponseTime": {
        "total": "2236",
        "ok": "1815",
        "ko": "2431"
    },
    "standardDeviation": {
        "total": "710",
        "ok": "956",
        "ko": "440"
    },
    "percentiles1": {
        "total": "2340",
        "ok": "1534",
        "ko": "2368"
    },
    "percentiles2": {
        "total": "2565",
        "ok": "2645",
        "ko": "2540"
    },
    "percentiles3": {
        "total": "2978",
        "ok": "3289",
        "ko": "2830"
    },
    "percentiles4": {
        "total": "4357",
        "ok": "4230",
        "ko": "3914"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 46,
    "percentage": 5
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 69,
    "percentage": 7
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 202,
    "percentage": 20
},
    "group4": {
    "name": "failed",
    "count": 683,
    "percentage": 68
},
    "meanNumberOfRequestsPerSecond": {
        "total": "83.333",
        "ok": "26.417",
        "ko": "56.917"
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
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1727",
        "ok": "1727",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "494",
        "ok": "494",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "514",
        "ok": "514",
        "ko": "-"
    },
    "percentiles1": {
        "total": "297",
        "ok": "297",
        "ko": "-"
    },
    "percentiles2": {
        "total": "791",
        "ok": "791",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1554",
        "ok": "1554",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1655",
        "ok": "1655",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 753,
    "percentage": 75
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 129,
    "percentage": 13
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 118,
    "percentage": 12
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "83.333",
        "ok": "83.333",
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
