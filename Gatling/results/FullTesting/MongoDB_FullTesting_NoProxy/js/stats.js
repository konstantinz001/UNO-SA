var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1890",
        "ok": "1563",
        "ko": "327"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "4200",
        "ok": "4200",
        "ko": "3698"
    },
    "meanResponseTime": {
        "total": "181",
        "ok": "136",
        "ko": "394"
    },
    "standardDeviation": {
        "total": "454",
        "ok": "422",
        "ko": "533"
    },
    "percentiles1": {
        "total": "13",
        "ok": "3",
        "ko": "100"
    },
    "percentiles2": {
        "total": "18",
        "ok": "16",
        "ko": "1065"
    },
    "percentiles3": {
        "total": "1161",
        "ok": "1204",
        "ko": "1127"
    },
    "percentiles4": {
        "total": "2039",
        "ok": "2042",
        "ko": "1143"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1443,
    "percentage": 76
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 40,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 80,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "count": 327,
    "percentage": 17
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.241",
        "ok": "5.989",
        "ko": "1.253"
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
        "total": "945",
        "ok": "618",
        "ko": "327"
    },
    "minResponseTime": {
        "total": "13",
        "ok": "13",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "4200",
        "ok": "4200",
        "ko": "3698"
    },
    "meanResponseTime": {
        "total": "359",
        "ok": "340",
        "ko": "394"
    },
    "standardDeviation": {
        "total": "590",
        "ok": "618",
        "ko": "533"
    },
    "percentiles1": {
        "total": "18",
        "ok": "17",
        "ko": "100"
    },
    "percentiles2": {
        "total": "393",
        "ok": "339",
        "ko": "1065"
    },
    "percentiles3": {
        "total": "1298",
        "ok": "1327",
        "ko": "1127"
    },
    "percentiles4": {
        "total": "2060",
        "ok": "2186",
        "ko": "1143"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 498,
    "percentage": 53
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 40,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 80,
    "percentage": 8
},
    "group4": {
    "name": "failed",
    "count": 327,
    "percentage": 35
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.621",
        "ok": "2.368",
        "ko": "1.253"
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
        "total": "945",
        "ok": "945",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "20",
        "ok": "20",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles4": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 945,
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
        "total": "3.621",
        "ok": "3.621",
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
