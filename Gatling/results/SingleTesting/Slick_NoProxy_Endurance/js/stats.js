var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1800",
        "ok": "1788",
        "ko": "12"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "33"
    },
    "maxResponseTime": {
        "total": "69",
        "ok": "69",
        "ko": "60"
    },
    "meanResponseTime": {
        "total": "22",
        "ok": "22",
        "ko": "52"
    },
    "standardDeviation": {
        "total": "20",
        "ok": "20",
        "ko": "8"
    },
    "percentiles1": {
        "total": "17",
        "ok": "8",
        "ko": "56"
    },
    "percentiles2": {
        "total": "40",
        "ok": "39",
        "ko": "56"
    },
    "percentiles3": {
        "total": "56",
        "ok": "56",
        "ko": "59"
    },
    "percentiles4": {
        "total": "61",
        "ok": "61",
        "ko": "60"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1788,
    "percentage": 99
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
    "count": 12,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.836",
        "ok": "9.77",
        "ko": "0.066"
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
        "total": "900",
        "ok": "888",
        "ko": "12"
    },
    "minResponseTime": {
        "total": "28",
        "ok": "28",
        "ko": "33"
    },
    "maxResponseTime": {
        "total": "69",
        "ok": "69",
        "ko": "60"
    },
    "meanResponseTime": {
        "total": "41",
        "ok": "41",
        "ko": "52"
    },
    "standardDeviation": {
        "total": "10",
        "ok": "10",
        "ko": "8"
    },
    "percentiles1": {
        "total": "40",
        "ok": "39",
        "ko": "56"
    },
    "percentiles2": {
        "total": "50",
        "ok": "50",
        "ko": "56"
    },
    "percentiles3": {
        "total": "58",
        "ok": "58",
        "ko": "59"
    },
    "percentiles4": {
        "total": "62",
        "ok": "62",
        "ko": "60"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 888,
    "percentage": 99
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
    "count": 12,
    "percentage": 1
},
    "meanNumberOfRequestsPerSecond": {
        "total": "4.918",
        "ok": "4.852",
        "ko": "0.066"
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
        "total": "900",
        "ok": "900",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "percentiles2": {
        "total": "4",
        "ok": "4",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles4": {
        "total": "7",
        "ok": "7",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 900,
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
        "total": "4.918",
        "ok": "4.918",
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
