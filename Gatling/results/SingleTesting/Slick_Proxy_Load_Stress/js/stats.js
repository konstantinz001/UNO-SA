var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "360",
        "ok": "349",
        "ko": "11"
    },
    "minResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "32"
    },
    "maxResponseTime": {
        "total": "80",
        "ok": "80",
        "ko": "55"
    },
    "meanResponseTime": {
        "total": "25",
        "ok": "25",
        "ko": "41"
    },
    "standardDeviation": {
        "total": "21",
        "ok": "21",
        "ko": "6"
    },
    "percentiles1": {
        "total": "20",
        "ok": "11",
        "ko": "41"
    },
    "percentiles2": {
        "total": "45",
        "ok": "45",
        "ko": "43"
    },
    "percentiles3": {
        "total": "56",
        "ok": "56",
        "ko": "51"
    },
    "percentiles4": {
        "total": "61",
        "ok": "62",
        "ko": "54"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 349,
    "percentage": 97
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
    "count": 11,
    "percentage": 3
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.714",
        "ok": "5.54",
        "ko": "0.175"
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
        "total": "180",
        "ok": "169",
        "ko": "11"
    },
    "minResponseTime": {
        "total": "31",
        "ok": "31",
        "ko": "32"
    },
    "maxResponseTime": {
        "total": "80",
        "ok": "80",
        "ko": "55"
    },
    "meanResponseTime": {
        "total": "45",
        "ok": "45",
        "ko": "41"
    },
    "standardDeviation": {
        "total": "9",
        "ok": "9",
        "ko": "6"
    },
    "percentiles1": {
        "total": "45",
        "ok": "46",
        "ko": "41"
    },
    "percentiles2": {
        "total": "51",
        "ok": "51",
        "ko": "43"
    },
    "percentiles3": {
        "total": "58",
        "ok": "59",
        "ko": "51"
    },
    "percentiles4": {
        "total": "63",
        "ok": "64",
        "ko": "54"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 169,
    "percentage": 94
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
    "count": 11,
    "percentage": 6
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2.857",
        "ok": "2.683",
        "ko": "0.175"
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
        "total": "180",
        "ok": "180",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles1": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles2": {
        "total": "6",
        "ok": "6",
        "ko": "-"
    },
    "percentiles3": {
        "total": "9",
        "ok": "9",
        "ko": "-"
    },
    "percentiles4": {
        "total": "12",
        "ok": "12",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 180,
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
        "total": "2.857",
        "ok": "2.857",
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
