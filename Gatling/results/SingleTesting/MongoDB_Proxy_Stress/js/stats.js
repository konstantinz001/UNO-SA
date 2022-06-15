var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "360",
        "ok": "345",
        "ko": "15"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "486",
        "ok": "486",
        "ko": "125"
    },
    "meanResponseTime": {
        "total": "14",
        "ok": "13",
        "ko": "31"
    },
    "standardDeviation": {
        "total": "28",
        "ok": "27",
        "ko": "32"
    },
    "percentiles1": {
        "total": "13",
        "ok": "5",
        "ko": "19"
    },
    "percentiles2": {
        "total": "19",
        "ok": "19",
        "ko": "21"
    },
    "percentiles3": {
        "total": "25",
        "ok": "24",
        "ko": "107"
    },
    "percentiles4": {
        "total": "71",
        "ok": "50",
        "ko": "121"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 345,
    "percentage": 96
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
    "count": 15,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.714",
        "ok": "5.476",
        "ko": "0.238"
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
        "ok": "165",
        "ko": "15"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "486",
        "ok": "486",
        "ko": "125"
    },
    "meanResponseTime": {
        "total": "24",
        "ok": "23",
        "ko": "31"
    },
    "standardDeviation": {
        "total": "36",
        "ok": "37",
        "ko": "32"
    },
    "percentiles1": {
        "total": "19",
        "ok": "19",
        "ko": "19"
    },
    "percentiles2": {
        "total": "21",
        "ok": "21",
        "ko": "21"
    },
    "percentiles3": {
        "total": "27",
        "ok": "27",
        "ko": "107"
    },
    "percentiles4": {
        "total": "105",
        "ok": "65",
        "ko": "121"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 165,
    "percentage": 92
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
    "count": 15,
    "percentage": 8
},
    "meanNumberOfRequestsPerSecond": {
        "total": "2.857",
        "ok": "2.619",
        "ko": "0.238"
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
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "63",
        "ok": "63",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "5",
        "ok": "5",
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
